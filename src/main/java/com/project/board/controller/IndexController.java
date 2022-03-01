package com.project.board.controller;

import java.util.ArrayList;


import java.util.List;

import com.project.board.model.*;
import com.project.board.service.CalendarService;
import com.project.board.service.MediaService;
import com.project.board.service.MusicalService;
import com.project.board.service.WeatherService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Service
@Controller
public class IndexController {

    @Autowired
    MediaService service;

    @Autowired
    CalendarService calendarService;

    @Autowired
    private WeatherService weatherService;

    @Autowired
    MusicalService musicalService;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        ArrayList<MediaVO> mediaList = service.listAllMedia();
        model.addAttribute("mediaList", mediaList);

        ArrayList<MusicalVO> musicalList = musicalService.getAllMusical();
        model.addAttribute("musicalList", musicalList);

        return "index2";
    }


    @RequestMapping("/vote")
    public String vote(Model model) {
        ArrayList<VoteVO> actorList = service.listAllActor();
        model.addAttribute("actorList", actorList);

        ArrayList<MusicalVO> musicalList = musicalService.getAllMusical();
        model.addAttribute("musicalList", musicalList);

        System.out.println(actorList);
        return "vote";
    }

    @RequestMapping("/voteActor/{actorNo}")
    public String voteActor(@PathVariable String actorNo, Model model)throws Exception{
        VoteVO vo = service.detailActor(actorNo);
        model.addAttribute("vo", vo);
        System.out.println(vo);
        System.out.println(vo.getActorName());
        service.voteUp(actorNo);

        return "redirect:../vote";
    }

    @RequestMapping("/voteMusical/{muscNo}")
    public String voteMusical(@PathVariable String muscNo, Model model)throws Exception{
        MusicalVO vo = musicalService.getMusical(muscNo);
        model.addAttribute("vo", vo);
        System.out.println(vo);
        System.out.println(vo.getGenreName());
        musicalService.voteUp(muscNo);

        return "redirect:../vote";
    }


    /*@RequestMapping("/calenList")
    @ResponseBody
    public CalendarVO calenList() throws Exception{
        CalendarVO calendarVO = new CalendarVO();
        calendarVO.setCalTitle("캘린더 테스트");

        return calendarVO;
    }*/

    /*@RequestMapping("calenView")
    public ModelAndView calenView (HttpServletRequest request, ModelMap modelMap, @ModelAttribute CalendarVO vo)throws Exception{
         HashMap resultMap = new HashMap();
         ModelAndView mv = new ModelAndView();
         CalendarVO result = calendarService.calenView(vo);
    }*/

    // 캘린더 db에서 불러올 코드 필요
    // json parsing 사용. responsebody 사용해서 페이지 로드 시 바로 불러오게 할 것

}
