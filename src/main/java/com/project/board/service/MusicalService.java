package com.project.board.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.project.board.dao.IMusicalDAO;
import com.project.board.model.ActorCastVO;
import com.project.board.model.MusicalVO;

@Service
public class MusicalService implements IMusicalService{
	
    @Autowired
    @Qualifier("IMusicalDAO")
    IMusicalDAO dao;
	
    
    @Override
    /**뮤지컬 상세 데이터 조회*/
    public MusicalVO getMusical(String muscNo){
        return dao.getMusical(muscNo);
    }


	public ArrayList<ActorCastVO> getActorCast(String muscNo) {
		return dao.getActorCast(muscNo);
	}

	public ArrayList<MusicalVO> getMusicalListByGenre(String genreNo) {
		return dao.getMusicalListByGenre(genreNo);
	}
    
}