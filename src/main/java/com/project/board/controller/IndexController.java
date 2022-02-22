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
import org.springframework.web.bind.annotation.ResponseBody;

@Service
@Controller
public class IndexController {
  
    @Autowired
    MediaService service;

    @RequestMapping(value="/", method=RequestMethod.GET)
    public String index(Model model) {
        ArrayList<MediaVO> mediaList = service.listAllMedia();
        model.addAttribute("mediaList", mediaList);

        return "index2";
    }
	
    @RequestMapping(value="/login", method=RequestMethod.GET)
    public String login() {
        return "login";
    }
    
    @RequestMapping(value="/chatbot", method=RequestMethod.GET)
    public String chatbot() {
        return "chatbot";
    }
    
    @RequestMapping(value="/signUp", method=RequestMethod.GET)
    public String signUp() {
        return "signUp";
    }
	
    @RequestMapping(value="/view", method=RequestMethod.GET)
    public String view() {
        return "view";
    }
}
