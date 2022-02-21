package com.project.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.project.board.dao.IBoardDAO4;
import com.project.board.model.BoardVO4;
import com.project.board.model.ReplyVO4;

@Service
public class BoardService4 implements IBoardService4{
	
    @Autowired
    @Qualifier("IBoardDAO4")
    IBoardDAO4 dao;
	
    
    @Override
    public List<BoardVO4> getBoard4(){
        return dao.getBoard4();
    }
    @Override
    public boolean addBoard4(BoardVO4 b) {
        return dao.addBoard4(b);
    }
    @Override
    public BoardVO4 getBoardOne4(int idx) {
        return dao.getBoardOne4(idx);
    }
    @Override
    public boolean addReply4(ReplyVO4 r) {
        return dao.addReply4(r);
    }
    @Override
    public List<ReplyVO4> getReply4(int boardIdx) {
        return dao.getReply4(boardIdx);
    }
    @Override
    public int updatereviewcnt4(int idx) {
		return dao.updatereviewcnt4(idx);
	}
    
    @Override
    public int count4() throws Exception {
     return dao.count4();
    }
    
    @Override
	public void deleteBoard4(String boardVo) {
		// TODO Auto-generated method stub
		dao.deleteBoard4(boardVo);
	}
    
    @Override
	public void deleteReply4(String replyVo) {
		// TODO Auto-generated method stub
		dao.deleteReply4(replyVo);
	}
    
    @Override
	public void updateBoard4(BoardVO4 b) {
		dao.updateBoard4(b);
		
	}
	
    @Override
	public BoardVO4 detailViewBoard4(int idx) {
		return dao.detailViewBoard4(idx);
	}
    
	/*
	 * @Override public int getBoardListCnt() throws Exception {
	 * 
	 * return dao.getBoardListCnt();
	 * 
	 * }
	 */

}