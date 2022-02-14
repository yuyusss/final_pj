package com.project.board.controller;

import com.project.board.model.MediaVO;
import com.project.board.service.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class MediaController {
    @Autowired
    MediaService service;

    @RequestMapping("listAllMedia")
    public String listAllMedia(Model model){
        ArrayList<MediaVO> mediaList = service.listAllMedia();
        model.addAttribute("mediaList", mediaList);

        return "index2";
    }
}
