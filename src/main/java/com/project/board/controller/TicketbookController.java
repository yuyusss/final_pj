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
import com.project.board.service.TicketbookService;

@Controller
public class TicketbookController {
		@Autowired
		private TicketbookService service;
	
		/*
	    @RequestMapping("/ticketbook/{memId}/{genre}")
		public String ticketbook(@PathVariable String memId, @PathVariable String genre, HttpSession session) {
	    	System.out.println(memId);
	    	System.out.println(genre);
	    	String result = "error";
	    	
//	    	ArrayList<String> genreList = new ArrayList<String>();
//	    	
//	    	String [] genreList = genre.split(",");
//	    	
//	    	System.out.println(genreList[0] + genreList[1]);
	    	
	    	  
	    	
//	    	List<HashMap<String, Object>> list= (List<HashMap<String, Object>>) service.getList(pMap);
//	    	Map<String, String> musicalData = new HashMap<String, String>();
	    	List<HashMap> musicalData = (List<HashMa>) service.getMusicalByGenre(genre);
	    	
	    	System.out.println(musicalData);
	    	
	    	
	    	if(musicalData != null) {
	    		session.setAttribute("musicalData", musicalData);
	    		
	    		result = "ticketbook/ticketbook";
	    	}
	    	

			return result;
	    }
	    
	    */
		
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
	    
}