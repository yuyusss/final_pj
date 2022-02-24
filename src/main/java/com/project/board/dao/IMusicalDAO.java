package com.project.board.dao;

import java.util.ArrayList;

import com.project.board.model.ActorCastVO;
import com.project.board.model.MusicalVO;

public interface IMusicalDAO {
	public MusicalVO getMusical(String muscNo);

	public ArrayList<ActorCastVO> getActorCast(String muscNo);

	public ArrayList<MusicalVO> getMusicalListByGenre(String genreNo);
	
}
