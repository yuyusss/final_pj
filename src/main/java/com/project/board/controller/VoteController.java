package com.project.board.controller;

import com.project.board.service.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VoteController {
    @Autowired
    MediaService service;

}
