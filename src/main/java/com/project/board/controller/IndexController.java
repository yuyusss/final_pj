package com.project.board.controller;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.project.board.model.CalendarVO;
import com.project.board.model.MediaVO;
import com.project.board.service.CalendarService;
import com.project.board.service.MediaService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Service
@Controller
public class IndexController {
  
    @Autowired
    MediaService service;

    @RequestMapping("/")
	public String index() {
		return "/index2";
	}

	/*
	 * @RequestMapping(value="/", method=RequestMethod.GET) public String
	 * index(Model model) { ArrayList<MediaVO> mediaList = service.listAllMedia();
	 * model.addAttribute("mediaList", mediaList);
	 * 
	 * return "index2"; }
	 * 
	 * 
	 * 
	 */
    
}
