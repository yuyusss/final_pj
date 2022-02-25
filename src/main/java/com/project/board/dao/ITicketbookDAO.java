package com.project.board.dao;

import java.util.ArrayList;

import com.project.board.model.HallVO;
import com.project.board.model.TicketbookVO;

public interface ITicketbookDAO {
	ArrayList<TicketbookVO> listAllTicketbook();   		// ** 전체 티켓 조회 인터페이스 코드 작성 
	ArrayList<TicketbookVO> listTicketByID(String memID);
	void insertticket(TicketbookVO ticketbookVo);
	void updateticket(TicketbookVO ticketbookVo);
	TicketbookVO listTicketByNO(String no);
	void deleteticket(TicketbookVO ticketbookVo);
	
}
