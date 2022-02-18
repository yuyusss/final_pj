package com.project.board.controller;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.project.board.model.CalendarVO;
import com.project.board.model.MediaVO;
import com.project.board.service.CalendarService;
import com.project.board.service.MediaService;
import com.project.board.service.WeatherService;
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

    @Autowired
    CalendarService calendarService;

    @Autowired
    private WeatherService weatherService;

    @RequestMapping(value="/", method=RequestMethod.GET)
    public String index(Model model) {
        ArrayList<MediaVO> mediaList = service.listAllMedia();
        model.addAttribute("mediaList", mediaList);

//        ArrayList<CalendarVO> calenList = calendarService.calenList();;
//        model.addAttribute("calenList", calenList);

        return "index2";
    }

    @RequestMapping("/vote")
    public String vote(){
        return "vote";
    }




}
