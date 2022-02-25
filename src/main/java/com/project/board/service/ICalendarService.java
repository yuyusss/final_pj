package com.project.board.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.project.board.model.CalendarVO;

@Service
public interface ICalendarService {
    public List<CalendarVO> calenList();

}
