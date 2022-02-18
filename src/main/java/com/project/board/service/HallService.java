package com.project.board.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.project.board.dao.IHallDAO;
import com.project.board.model.HallVO;


@Service
public class HallService implements IHallService {
	
	@Autowired
	@Qualifier("IHallDAO")
	IHallDAO dao;
	

	@Override
	public ArrayList<HallVO> listAllHall() {		// ** 전체 상품 조회 코드 작성 
		// TODO Auto-generated method stub
		return dao.listAllHall();
	}
}
