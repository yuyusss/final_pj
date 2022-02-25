package com.project.board.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.project.board.dao.ITicketbookDAO;
import com.project.board.model.HallVO;
import com.project.board.model.TicketbookVO;

@Service
public class TicketbookService implements ITicketbookService {
	
	@Autowired
	@Qualifier("ITicketbookDAO")
	ITicketbookDAO dao;
	

	@Override
	public ArrayList<TicketbookVO> listAllTicketbook(String memID) {		// ** 전체 상품 조회 코드 작성 
		// TODO Auto-generated method stub
		return dao.listAllTicketbook();
	}
	@Override
	public ArrayList<TicketbookVO> listTicketByID(String memID) {
		// TODO Auto-generated method stub
		return dao.listTicketByID(memID);
	}

	@Override
	public void insertticket(TicketbookVO ticketbookVo) {
		// TODO Auto-generated method stub
		dao.insertticket(ticketbookVo);
	}
	@Override
	public void updateticket(TicketbookVO ticketbookVo) {
		// TODO Auto-generated method stub
		dao.updateticket(ticketbookVo);
	}
	@Override
	public TicketbookVO listTicketByNO(String no) {
		// TODO Auto-generated method stub
		return dao.listTicketByNO(no);
	}
	@Override
	public void deleteticket(TicketbookVO ticketbookVo) {
		// TODO Auto-generated method stub
		dao.deleteticket(ticketbookVo);
	}

}


