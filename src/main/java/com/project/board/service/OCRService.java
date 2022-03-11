package com.project.board.service;

import java.io.BufferedReader;


import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.UUID;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Service;

import com.project.board.model.TicketVO;
import com.project.board.model.TicketbookVO;

@Service
public class OCRService {
	public TicketVO clovaOCRService(String filePathName) {
		// API 복사
		String apiURL = "https://ix8vuazcqc.apigw.ntruss.com/custom/v1/14571/3c1cc0dc6781d93a406367b45476703fcf02a61326ec6dd024f4f0dbe46426d1/infer";
		String secretKey = "RWtxU01jSHVJR2pHUUpNQ1FNQkpYd1ZTSGdORXVkYmI=";
		String imageFile = filePathName;
		TicketVO ticketVO = new TicketVO();		

		try {
			URL url = new URL(apiURL);
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			con.setUseCaches(false);
			con.setDoInput(true);
			con.setDoOutput(true);
			con.setReadTimeout(30000);
			con.setRequestMethod("POST");
			String boundary = "----" + UUID.randomUUID().toString().replaceAll("-", "");
			con.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + boundary);
			con.setRequestProperty("X-OCR-SECRET", secretKey);

			JSONObject json = new JSONObject();
			json.put("version", "V2");
			json.put("requestId", UUID.randomUUID().toString());
			json.put("timestamp", System.currentTimeMillis());
			JSONObject image = new JSONObject();
			image.put("format", "jpg");
			image.put("name", "demo");
			JSONArray images = new JSONArray();
			images.put(image);
			json.put("images", images);
			String postParams = json.toString();

			con.connect();
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			long start = System.currentTimeMillis();
			File file = new File(imageFile);
			writeMultiPart(wr, postParams, file, boundary);
			wr.close();

			int responseCode = con.getResponseCode();
			BufferedReader br;
			if (responseCode == 200) {
				br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			} else {
				br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			String inputLine;
			StringBuffer response = new StringBuffer();
			while ((inputLine = br.readLine()) != null) {
				response.append(inputLine);
			}
			br.close();

			System.out.println(response); // API 호출 결과를 콘솔에 출력
			
			// jsonToString() 메소드 호출하고 결과 받아옴
			ticketVO = jsonToString(response.toString());
			//System.out.println(result); // 뭔가가 있는 줄 알았어요
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return ticketVO;
	}
	
	private static void writeMultiPart(OutputStream out, String jsonMessage, File file, String boundary) throws
		IOException {
		StringBuilder sb = new StringBuilder();
		sb.append("--").append(boundary).append("\r\n");
		sb.append("Content-Disposition:form-data; name=\"message\"\r\n\r\n");
		sb.append(jsonMessage);
		sb.append("\r\n");
	
		out.write(sb.toString().getBytes("UTF-8"));
		out.flush();
	
		if (file != null && file.isFile()) {
			out.write(("--" + boundary + "\r\n").getBytes("UTF-8"));
			StringBuilder fileString = new StringBuilder();
			fileString
				.append("Content-Disposition:form-data; name=\"file\"; filename=");
			fileString.append("\"" + file.getName() + "\"\r\n");
			fileString.append("Content-Type: application/octet-stream\r\n\r\n");
			out.write(fileString.toString().getBytes("UTF-8"));
			out.flush();
	
			try (FileInputStream fis = new FileInputStream(file)) {
				byte[] buffer = new byte[8192];
				int count;
				while ((count = fis.read(buffer)) != -1) {
					out.write(buffer, 0, count);
				}
				out.write("\r\n".getBytes());
			}
	
			out.write(("--" + boundary + "--\r\n").getBytes("UTF-8"));
		}
		out.flush();
	}
public TicketVO jsonToString(String jsonResultStr) {
		
		// API 서버로부터 받은 JSON 형태의 데이톨부터 value와 confidence 추출해서
				// VO 리스트 만들어 반환
		TicketVO vo = new TicketVO();
					
					try {			
						//JSONParser jsonParser = new JSONParser();
						JSONObject jsonObj = new JSONObject(jsonResultStr);
						JSONArray imageArray = (JSONArray) jsonObj.get("images");
						JSONObject tempObj = (JSONObject)imageArray.getJSONObject(0);	
						
						// title 추출
						String title = "";
						if(imageArray != null) {
							JSONObject titleObj = (JSONObject)tempObj.get("title");
							
							title = (String) titleObj.getString("inferText");
							title = title.substring(0, title.length() -1);
							vo.setSubject(title);
							//System.out.println(title.substring(0, title.length() -1));
						}						
						
						JSONArray fieldArray = (JSONArray) tempObj.get("fields");
						if(fieldArray != null) {							
							JSONObject dateObj = (JSONObject) fieldArray.get(0);
							String date = (String) dateObj.getString("inferText");
							
							JSONObject timeObj = (JSONObject) fieldArray.get(1);
							String time = (String) timeObj.getString("inferText");
							
							JSONObject theaterObj = (JSONObject) fieldArray.get(2);
							String theater = (String) theaterObj.getString("inferText");
							
							JSONObject seatObj = (JSONObject) fieldArray.get(3);
							String seat = (String) seatObj.getString("inferText");
							
							JSONObject priceObj = (JSONObject) fieldArray.get(4);
							String price = (String) priceObj.getString("inferText");
																		
//							System.out.println(date); 
//							System.out.println(time); 
//							System.out.println(theater); 
//							System.out.println(seat); 
//							System.out.println(price); 							
							
							vo.setSeat(title);
							vo.setDate(date);
							vo.setTime(time);
							vo.setTheater(theater);
							vo.setSeat(seat);
							vo.setPrice(price);
						} else {						
							
							vo.setSubject("없음");
							vo.setDate("없음");
							vo.setTime("없음");
							vo.setTheater("없음");
							vo.setSeat("없음");
							vo.setPrice("없음");							
						}
						
						
						//JSON 형태의 문자열에서 JSON 오브젝트 "faces" 추출해서 JSONArray에 저장
//						if(ticketArray != null) {
//							// JSONArray의 각 요소에서 value와 confidence 추출
//							for(int i=0; i < ticketArray.length(); i++) {
//								TicketVO vo = new TicketVO();
//								JSONObject tempObj = (JSONObject) ticketArray.get(i);
//								
//								String value = "";
//											
//								
//								// subject  추출
//								JSONObject subjectObj = (JSONObject) tempObj.get("subject");
//								value = (String) subjectObj.get("value");
//								// vo subject 값 설정
//								vo.setSubject(value);
//													
//								
//								// date  추출
//								JSONObject dateObj = (JSONObject) tempObj.get("date");
//								value = (String) dateObj.get("value");
//								// vo date 값 설정
//								vo.setDate(value);
//								
//								// time  추출
//								JSONObject timeObj = (JSONObject) tempObj.get("time");
//								value = (String) timeObj.get("value");
//								// vo time 값 설정
//								vo.setTime(value);
//
//								// theater  추출
//								JSONObject theaterObj = (JSONObject) tempObj.get("theater");
//								value = (String) theaterObj.get("value");
//								// vo theater 값 설정
//								vo.setTheater(value);
//								
//								// seat  추출
//								JSONObject seatObj = (JSONObject) tempObj.get("seat");
//								value = (String) seatObj.get("value");
//								// vo seat 값 설정
//								vo.setSeat(value);
//								
//								// price  추출
//								JSONObject priceObj = (JSONObject) tempObj.get("price");
//								value = (String) priceObj.get("value");
//								// vo price 값 설정
//								vo.setPrice(value);
//
//								// FaceVO에 담아 리스트에 추가
//								
//								System.out.println("///////////////////");
//								System.out.println(vo.getSubject());
//								System.out.println(vo.getDate());
//								System.out.println(vo.getTime());
//								System.out.println(vo.getTheater());
//								System.out.println(vo.getSeat());
//								System.out.println(vo.getPrice());
//							}
//							
//						} else {
//							//감지한 항목이 없는 경우 ("faces":[])
//							TicketVO vo = new TicketVO();
//							vo.setSubject("없음");
//							vo.setDate("없음");
//							vo.setTime("없음");
//							vo.setTheater("없음");
//							vo.setSeat("없음");
//							vo.setPrice("없음");
//							
//						}
						
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					return vo;
		}
}

