package com.project.board.dao;

import com.project.board.model.CalendarVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

public class ICalendarDAO {
    @Autowired
    private SqlSession sqlSession;

    private static final String namespace = "com.project.board.dao.ICalendarDAO";

    public List<CalendarVO> showSchedule() throws Exception{
       return sqlSession.selectList(namespace + ".showSchedule");
    }
}
