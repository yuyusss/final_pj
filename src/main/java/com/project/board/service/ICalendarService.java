package com.project.board.service;

import com.project.board.model.CalendarVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public interface ICalendarService {
    ArrayList<CalendarVO> calenList(); // 전체 일정 조회
}
