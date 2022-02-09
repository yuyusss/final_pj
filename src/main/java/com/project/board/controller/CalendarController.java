package com.project.board.controller;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CalendarController {

    @RequestMapping("/insertCalendar")
    public String showCalendar(){
        return "index2";
    }

}
