package com.project.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RankController {
		
	@RequestMapping(value="/rank", method=RequestMethod.GET)
    public String rank() {
        return "ranking/ranking";
    }
}
