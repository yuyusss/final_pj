package com.project.board.service;

import com.project.board.model.CalendarVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public abstract class ICalendarService {
    @Autowired
    private SqlSession sqlSession;

    public List<CalendarVO> getCalendar() throws Exception{
        List<CalendarVO> calendar = null;
        calendar = sqlSession.selectList("Calendar.calendarList");
        return calendar;
    }

    public abstract List<CalendarVO> showSchedule() throws Exception;
}
