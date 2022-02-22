package com.project.board.dao;

import java.util.ArrayList;

import com.project.board.model.HallVO;
import com.project.board.model.TicketbookVO;

public interface ITicketbookDAO {
	ArrayList<TicketbookVO> listAllTicketbook();   		// ** 전체 공연장 조회 인터페이스 코드 작성 

}
