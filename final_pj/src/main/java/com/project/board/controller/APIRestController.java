package com.project.board.controller;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.project.board.service.OCRService;
import com.project.board.model.TicketVO;
import com.project.board.service.ChatbotService;


@RestController
public class APIRestController {

	@Autowired
	private ChatbotService chatService;	
	
	
	@Autowired
	private OCRService ocrService;
		

	@RequestMapping("/chatbotCall")
		public String  chatbotCall(@RequestParam("message") String message ) {
			String results = chatService.main(message);
			//System.out.println("2:" + result);
			return results;
		}
		
		
		
		

	
	
		
	
}
