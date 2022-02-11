package com.project.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HallController {
	@RequestMapping("/hall")
	public String hall() {
		return "hall/hall";
	}
	@RequestMapping("/hall2")
	public String hall2() {
		return "hall/hall2";
	}
}
