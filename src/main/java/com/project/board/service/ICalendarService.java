package com.project.board.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.project.board.model.CalendarVO;

@Service
public interface ICalendarService {
    ArrayList<CalendarVO> calenList(); // 전체 일정 조회

}
