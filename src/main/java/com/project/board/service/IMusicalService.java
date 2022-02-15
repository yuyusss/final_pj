package com.project.board.service;

import org.springframework.stereotype.Service;

import com.project.board.model.MusicalVO;

@Service
public interface IMusicalService {
	/**뮤지컬 상세 데이터 조회*/
	public MusicalVO getMusical(String muscNo);
	
}
