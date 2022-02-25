package com.project.board.controller;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.board.model.MusicalByGenreVO;
import com.project.board.model.MusicalVO;




import com.project.board.model.TicketbookVO;

import com.project.board.service.TicketbookService;

@Controller
public class TicketbookController {

		@Autowired
		private TicketbookService service;
	
		
		
		@RequestMapping("/favorRecommand/{memId}") 
	    public String favorRecommand(@PathVariable String memId, HttpSession session) {
			System.out.println(memId);
			
			String result = "";
			
			ArrayList<MusicalByGenreVO> vo = service.getMusicalByGenre(memId);
			
			
			System.out.println(vo);
			
			if(vo != null) {
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
			
			if(vo != null) {
				session.setAttribute("mByg", vo);
				
				result = "/ticketbook/ticketbook";
			}
			
			return result;
		}
		
		
		 @RequestMapping("/ticketbook")
			public String ticketbook() {
		    	
				return "ticketbook/ticketbook";
		    }
	    

   

    @RequestMapping("/ticketDetailView") //
    public String ticketbook(Model model) {
        ArrayList<TicketbookVO> pjhTicketList = service.listTicketByID("sid");

        model.addAttribute("pjhTicketList", pjhTicketList); // 2


        ArrayList<TicketbookVO> ticketList = service.listAllTicketbook(); //
        model.addAttribute("ticketList", ticketList);

        return "ticketbook/ticketDetailView";
    }

    @RequestMapping("/ticketbook/ticketInsertForm")
    public String insertform() {


        return "ticketbook/ticketbook";
    }
    
    
 

    
    @RequestMapping("/ticketbook/insertticket") //추가 페이지
    public String insertticket(TicketbookVO ticketbookVo) {
        service.insertticket(ticketbookVo);
        return "ticketbook/ticketInsertForm";
    }


}