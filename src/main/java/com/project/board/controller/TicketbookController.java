package com.project.board.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.board.model.HallVO;
import com.project.board.model.TicketbookVO;
import com.project.board.service.TicketbookService;

@Controller
public class TicketbookController {
    @Autowired
    TicketbookService service;

    @RequestMapping("/ticketDetailView") //
    public String ticketbook(Model model, HttpSession session) {
    	
    	String memId = (String)session.getAttribute("sid");
    	
        ArrayList<TicketbookVO> ticketList = service.listTicketByID(memId);
        model.addAttribute("ticketList", ticketList); // 2


        return "ticketbook/ticketDetailView";
    }

    @RequestMapping("/ticketbook/ticketInsertForm")
    public String insertform() {


        return "ticketbook/ticketbook";
    }
    
    @RequestMapping ("/ticketbook")
    public String ticketbookmain() {
    	return "ticketbook/ticketbook";
    }
 

    
    @RequestMapping("/ticketbook/insertticket") //추가 페이지
    public String insertticket(TicketbookVO ticketbookVo) {
        service.insertticket(ticketbookVo);
        return "ticketbook/ticketInsertForm";
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
    	TicketbookVO ticketbook = service.listTicketByNO(no);
		model.addAttribute("ticketbook", ticketbook);
		
		return "ticketbook/ticketDeleteForm";
	}
	@RequestMapping("/ticketbook/deleteticket") // 삭제페이지
	public String deleteticket(TicketbookVO ticketbookVo ) {
		service.deleteticket(ticketbookVo );
		return "redirect:../ticketDetailView"; //DB저장 컨트롤러
	}
	
}