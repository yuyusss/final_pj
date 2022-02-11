package com.project.board.service;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.project.board.dao.ICalendarDAO;
import com.project.board.model.CalendarVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalendarService{

    @JacksonInject
    ICalendarDAO dao;

    public List<CalendarVO> showSchedule() throws Exception{
        return dao.showSchedule();
    }
}
