package com.project.board.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.project.board.model.TicketbookVO;

@Service
public interface ITicketbookService {
	
	ArrayList<TicketbookVO> listAllTicketbook();

	}



