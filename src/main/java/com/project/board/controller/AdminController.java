package com.project.board.controller;

import com.project.board.model.*;
import com.project.board.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class AdminController {

    @Autowired
    MusicalService musicalService;

    @Autowired
    HallService hallService;

    @Autowired
    MediaService mediaService;

    @Autowired
    CalendarService calendarService;

    @Autowired
    MemberService memberService;

    @RequestMapping("/adminPage")
    public String adminPage(Model model) {

        return "admin/adminPage";
    }

    // member 관리자 페이지
    @RequestMapping("/adminMember")
    public String adminMember(Model model){
        ArrayList<MemberVO> memList = memberService.getAllMember();
        model.addAttribute("memList", memList);

        return "admin/adminMember";
    }

    // musical 관리자 페이지
    @RequestMapping("/adminMusical")
    public String adminMusical(Model model){
        ArrayList<MusicalVO> musicalList = musicalService.getAllMusical();
        model.addAttribute("musicalList", musicalList);

        return "admin/adminMusical";
    }

    // actor 관리자 페이지
    @RequestMapping("/adminActor")
    public String adminActor(Model model){
        ArrayList<VoteVO> actorList = mediaService.listAllActor();
        model.addAttribute("actorList", actorList);

        return "admin/adminActor";
    }

    // calendar 관리자 페이지
    @RequestMapping("/adminCalendar")
    public String adminCalendar(Model model){
        ArrayList<CalendarVO> planList = calendarService.getAllPlan();
        model.addAttribute("planList", planList);

        return "admin/adminCalendar";
    }

    // 수정 페이지로 이동
    @RequestMapping("/updateScheduleForm/{calNo}")
    public String updateScheduleForm(@PathVariable("calNo") int calNo, Model model){
        CalendarVO calen = calendarService.detailPlan(calNo);

        model.addAttribute("calen", calen);
        return "admin/adminUpdateCalendar";
    }

    // 일정 update
    @RequestMapping("/updateSchedule")
    public String updateSchedule(CalendarVO calendarVO){
        calendarService.updateSchedule(calendarVO);
        return "redirect:./adminCalendar";
    }

    // 일정 등록
    @RequestMapping("/insertScheduleForm")
    public String insertScheduleForm(){
        return "admin/adminInsertCalendar";
    }

    @RequestMapping("insertSchedule")
    public String insertSchedule(CalendarVO calendarVO){
        calendarService.insertSchedule(calendarVO);

        return "redirect:./adminCalendar";
    }

    // 일정 삭제
    @RequestMapping("/deleteSchedule/{calNo}")
    public String deleteSchedule(@PathVariable int calNo){
        calendarService.deleteSchedule(calNo);
        return "redirect:../adminCalendar";
    }
}
