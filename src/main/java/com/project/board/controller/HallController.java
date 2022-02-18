package com.project.board.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.board.model.HallVO;
import com.project.board.service.HallService;

@Controller
public class HallController {
	@Autowired
	HallService service;
	
	@RequestMapping("/hall")
	public String hall(Model model) {
		System.out.println("hall = " + service.listAllHall());
		
		ArrayList<HallVO> hallList = service.listAllHall();
		model.addAttribute("hallList", hallList);
		return "hall/hall";
	}
	@RequestMapping("/hall2")
	public String hall2() {
		return "hall/hall2";
	}
	
	/* 
	 * 홀(/hall)로 접속했을 때,
	 * 데이터베이스에서 전체 홀 목록 가져와서
	 * 뷰 페이지에 출력하기
	 * 
	 * 0) VO - HallVO
	 * 1) 컨트롤러
	 * 2) 서비스 - 2개 HallService (Class) , IHallService (Interface)
	 * 3) DAO	- 1개 HallDAO
	 * 4) Mapper - HallMapper
	 * 5) 뷰 페이 수정 
	 */
}
