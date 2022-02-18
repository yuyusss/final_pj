package com.project.board.controller;
import com.project.board.model.CalendarVO;
import com.project.board.service.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.PrintWriter;
import java.util.ArrayList;


@Controller
public class CalendarController {
    @Autowired
    CalendarService service;

    @GetMapping(params = "method=list")
    public String list(){
        return "index2";
    }

    @GetMapping(params = "method=data")
    public String data(Model model){
        model.addAttribute("list", service.calenList());
        return "index2";
    }
}
