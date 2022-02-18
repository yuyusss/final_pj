package com.project.board.dao;

import com.project.board.model.CalendarVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

public interface ICalendarDAO {
    ArrayList<CalendarVO> calenList(); // 전체 일정 조회

}
