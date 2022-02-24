package com.project.board.service;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.project.board.dao.ITicketbookDAO;
import com.project.board.model.MusicalByGenreVO;
import com.project.board.model.TicketbookVO;

@Service
public class TicketbookService implements ITicketbookService {
	
	@Autowired
	@Qualifier("ITicketbookDAO")
	ITicketbookDAO dao;
	

	@Override
	public ArrayList<TicketbookVO> listAllTicketbook() {		// ** 전체 상품 조회 코드 작성 
		return dao.listAllTicketbook();
	}

	@Override
	public ArrayList<MusicalByGenreVO> getMusicalByGenre(String memId) {
		return dao.getMusicalByGenre(memId);
	}

	
	/**회원이 선택한 장르에 해당하는 뮤지컬 데이터 조회*/	
	/*
	 * public Map<String, String> getMusicalByGenre(String memId) { return
	 * dao.getMusicalByGenre(); }
	 */
	
}


