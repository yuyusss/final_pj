package com.project.board.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.board.model.TicketbookVO;
import com.project.board.service.TicketbookService;

@Controller
public class TicketbookController {
    @Autowired
    TicketbookService service;

    @RequestMapping("/ticketbook") //
    public String ticketbook(Model model) {
        ArrayList<TicketbookVO> pjhTicketList = service.listTicketByID("pjh");

        model.addAttribute("pjhTicketList", pjhTicketList); // 2


        ArrayList<TicketbookVO> ticketList = service.listAllTicketbook(); //
        model.addAttribute("ticketList", ticketList);

        return "ticketbook/ticketbook";
    }

    @RequestMapping("/ticketbook/ticketInsertForm")
    public String insertform() {


        return "ticketbook/ticketbook";
    }

    @RequestMapping("/ticketbook/insertticket") //추가 페이지
    public String insertticket(TicketbookVO ticketbookVo) {
        service.insertticket(ticketbookVo);
        return "ticketbook/ticketInsertForm";
    }

}