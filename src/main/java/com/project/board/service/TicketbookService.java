package com.project.board.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.project.board.dao.ITicketbookDAO;
import com.project.board.model.TicketbookVO;

@Service
public class TicketbookService implements ITicketbookService {
	
	@Autowired
	@Qualifier("ITicketbookDAO")
	ITicketbookDAO dao;
	

	@Override
	public ArrayList<TicketbookVO> listAllTicketbook() {		// ** 전체 상품 조회 코드 작성 
		// TODO Auto-generated method stub
		return dao.listAllTicketbook();
	}

}


