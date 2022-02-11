package com.project.board.controller;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.project.board.model.CalendarVO;
import com.project.board.service.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
  
    @Autowired
    CalendarService service;

    @RequestMapping(value="/", method=RequestMethod.GET)
    public String index() {
        return "index2";
    }
    
}
