package com.project.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;

import com.project.board.model.MusicalVO;
import com.project.board.service.MusicalService;


@Controller
public class detailPageController {
	@Autowired
	private MusicalService service;
	
	
	// 상세정보 페이지로 이동
	@RequestMapping("/detailView")
	public String detailView() {
		return "/DetailView/detailPage";
	}
	
	// 뮤지컬 상세정보 페이지 이동.
	@RequestMapping("/testDetail/{muscNo}")
	public String testDetail(@PathVariable String muscNo, HttpSession session) {
		System.out.println(muscNo);
		
		String result = "";
		
		MusicalVO vo = service.getMusical(muscNo);
//		ActorVO vo2 = service.getActors(muscNo);
		
		System.out.println(vo.toString());
		
		if(vo != null) {
			session.setAttribute("musicalData", vo);
//			session.setAttribute("actorData", vo2);
			result = "/DetailView/test";
		}
		
		
		return result;
	}

	
	/*
	 * 
	 *  
	 * 1) 컨트롤러
	 * 2) 서비스 추가 - 인터페이스, 클래스 
	 * 3) DAO 
	 * 4) 맵퍼
	 * 5) VO
	 * 
	 */
}
