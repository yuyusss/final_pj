package com.project.board.controller;

import com.project.board.model.HallVO;
import com.project.board.model.MusicalVO;
import com.project.board.model.VoteVO;
import com.project.board.service.HallService;
import com.project.board.service.MediaService;
import com.project.board.service.MusicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class AdminController {

    @Autowired
    private MusicalService musicalService;

    @Autowired
    HallService hallService;

    @Autowired
    MediaService mediaService;

    @RequestMapping("/adminPage")
    public String adminPage(Model model) {

        ArrayList<MusicalVO> musicalList = musicalService.getAllMusical();
        model.addAttribute("musicalList", musicalList);

        ArrayList<HallVO> seoulHallList = hallService.listHallByArea("seoul");
        model.addAttribute("seoulHallList", seoulHallList);

        ArrayList<VoteVO> actorList = mediaService.listAllActor();
        model.addAttribute("actorList", actorList);

        return "admin/adminPage";
    }

    @RequestMapping("/adminMember")
    public String adminMember(Model model){


        return "admin/adminMember";
    }

    @RequestMapping("/adminMusical")
    public String adminMusical(Model model){
        ArrayList<MusicalVO> musicalList = musicalService.getAllMusical();
        model.addAttribute("musicalList", musicalList);

        return "admin/adminMusical";
    }
}
