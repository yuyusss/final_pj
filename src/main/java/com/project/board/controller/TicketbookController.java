package com.project.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TicketbookController {
	    
	    @RequestMapping("/ticketbook")
		public String ticketbook() {
	    	
			return "ticketbook/ticketbook";
	    }
	    
	    
	    
}