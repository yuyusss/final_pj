package com.project.board.controller;
import java.util.ArrayList;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.project.board.model.CalendarVO;
import com.project.board.model.MediaVO;
import com.project.board.model.VoteVO;
import com.project.board.service.CalendarService;
import com.project.board.service.MediaService;
import com.project.board.service.WeatherService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.board.model.MediaVO;
import com.project.board.service.CalendarService;
import com.project.board.service.MediaService;

@Service
@Controller
public class IndexController {
  
    @Autowired
    MediaService service;


    @Autowired
    private WeatherService weatherService;


	 @RequestMapping(value="/", method=RequestMethod.GET) 
	 public String index(Model model) { 
	ArrayList<MediaVO> mediaList = service.listAllMedia();
	 model.addAttribute("mediaList", mediaList);
	  
	 return "index2"; 
	 }


//        ArrayList<CalendarVO> calenList = calendarService.calenList();;
//        model.addAttribute("calenList", calenList);


    @RequestMapping("/vote")
    public String vote(Model model){
        ArrayList<VoteVO> actorList = service.listAllActor();
        model.addAttribute("actorList", actorList);

        return "vote";
    }

 /*   @RequestMapping("/voteView")
    @ResponseBody
    public VoteVO voteList(@RequestParam("actorNo")int actorNo) throws Exception{
        System.out.println("actorNo, vote = " + actorNo);
        service.updateVoteCnt(actorNo);

        return "vote";
    }*/



}
