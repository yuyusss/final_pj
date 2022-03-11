package com.project.board.controller;

import java.io.File;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.project.board.model.MusicalByGenreVO;
import com.project.board.model.TicketVO;
import com.project.board.model.TicketbookVO;
import com.project.board.service.OCRService;
import com.project.board.service.TicketbookService;

@Controller
public class TicketbookController {

    @Autowired
    private TicketbookService service;
    
    @Autowired
    private OCRService ocrService;


    @RequestMapping("/favorRecommand/{memId}")
    public String favorRecommand(@PathVariable String memId, HttpSession session) {
        System.out.println(memId);

        String result = "";

        ArrayList<MusicalByGenreVO> vo = service.getMusicalByGenre(memId);


        System.out.println(vo);

        if (vo != null) {
            session.setAttribute("mByg", vo);

            result = "/layout/recommand";
        }

        return result;
    }

    @RequestMapping("/ticketbook/{memId}")
    public String detailView(@PathVariable String memId, HttpSession session) {
        System.out.println(memId);

        String result = "";

        ArrayList<MusicalByGenreVO> vo = service.getMusicalByGenre(memId);


        System.out.println(vo);

        if (vo != null) {
            session.setAttribute("mByg", vo);

            result = "/ticketbook/ticketbook";
        }

        return result;
    }


    
    
    @RequestMapping("/ticketbook")
    public String ticketbook() {

        return "ticketbook/ticketbook";
    }


    @RequestMapping("/ticketDetailView") // 전체 리스트
    public String ticketDetailView(Model model, HttpSession session) {
    	
    	String memId = (String)session.getAttribute("sid1");
    	
        ArrayList<TicketbookVO> ticketList = service.listTicketByID(memId);
        model.addAttribute("ticketList", ticketList); // 2


        return "ticketbook/ticketDetailView";
    }
    
    @RequestMapping("/ticketbook/ticketDetailView/{no}")
	public String detailViewticket(@PathVariable("no") String no, Model model ) {
		
    	TicketbookVO ticketbook = service.detailViewticket(no);
		model.addAttribute("ticketbook", ticketbook);
	
		
		return "ticketbook/ticketDetailView";
	}
   
    
    
    

    @RequestMapping("/ticketbook/ticketInsertForm")
    public String insertform() {


        return "ticketbook/ticketInsertForm";
    }


    @RequestMapping("/ticketbook/insertticket") //추가 페이지
    public String insertticket(TicketbookVO ticketbookVo) {
        service.insertticket(ticketbookVo);
        return "redirect:../ticketDetailView";
    }
    
    @RequestMapping("/ticketbook/updateticketform/{no}") // 수정할페이지 번호
	public String updateform( @PathVariable("no") String no, Model model) {
		TicketbookVO ticketbook = service.listTicketByNO(no);
		model.addAttribute("ticketbook", ticketbook);
		
		return "ticketbook/ticketUpdateForm";
	}
    @RequestMapping("/ticketbook/updateticket") //수정 페이지
    public String updateticket(TicketbookVO ticketbookVo) {
        service.updateticket(ticketbookVo);
        
        return "redirect:../ticketDetailView";
    }
    
    @RequestMapping("/ticketbook/deleteticketform/{no}") // 삭제할 페이지 번호
	public String deleteform( @PathVariable("no") String no, Model model) {
    	service.deleteticket(no );
		return "redirect:../../ticketDetailView"; //DB저장 컨트롤러
	}
    
    @RequestMapping("/clovaOCRForm")
	public String clovaOCRForm() {
		
		return "ticketbook/ocrView";
	}
	
	@RequestMapping("/clovaOCR")
	public String  faceRecogCel(@RequestParam("uploadFile") MultipartFile file, Model model) {		
		String result = "";
		
		try {
			// 1. 파일 저장 경로 설정 : 실제 서비스되는 위치 (프로젝트 외부에 저장)
			String uploadPath = "/upload/";
			
			// 2. 원본 파일 이름 알아오기
			String originalFileName = file.getOriginalFilename();
			String filePathName = uploadPath + originalFileName;
			
			// 3. 파일 생성
			File file1 = new File(filePathName);
			
			// 4. 서버로 전송
			file.transferTo(file1);				
			
			// 서비스에 파일 path와 파일명 전달  -> 서비스 메소드에서 변경
			// 서비스에서 반환된 텍스트를 result에 저장
			TicketVO ticketVO = ocrService.clovaOCRService(filePathName);
			model.addAttribute("ticketVO", ticketVO);

			//System.out.println(result);
			
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "/ticketbook/ticketInsertForm";
	}
}