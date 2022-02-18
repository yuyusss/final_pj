package com.project.board.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class detailPageController {
	
	/*
	 * @Autowired MemberService service;
	 */
	
	// 상세정보 페이지로 이동
	@RequestMapping("/detailView")
	public String detailView() {
		return "/DetailView/detailPage";
	}
	
	@RequestMapping("/testDetail")
	public String testDetail() {
		return "/DetailView/test";
	}
	
}
