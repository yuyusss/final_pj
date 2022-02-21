package com.project.board.service;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.project.board.dao.ICalendarDAO;
import com.project.board.model.CalendarVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CalendarService implements ICalendarService{
    @Autowired
    @Qualifier("ICalendarDAO")
    ICalendarDAO dao;

    @Override
    public ArrayList<CalendarVO> calenList() {
        return dao.calenList();
    }

}
