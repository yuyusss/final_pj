package com.project.board.service;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.project.board.model.MusicalByGenreVO;
import com.project.board.model.TicketbookVO;

@Service
public interface ITicketbookService {
	
	public ArrayList<TicketbookVO> listAllTicketbook();

	/**회원이 선택한 장르에 해당하는 뮤지컬 데이터 조회*/
	public ArrayList<MusicalByGenreVO> getMusicalByGenre(String memId);
	/*
	 * Map<String, String> getMusicalByGenre(String memId);
	 */
	
	}



