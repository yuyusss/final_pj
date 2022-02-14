package com.project.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.project.board.dao.Board;
import com.project.board.dao.Reply;
import com.project.board.mapper.BoardMapper;

@Service
public class BoardService {
	
    @Autowired
    @Qualifier("BoardMapper")
    private BoardMapper m;
	
    public List<Board> getBoard(){
        return m.getBoard();
    }
    
    public boolean addBoard(Board b) {
        return m.addBoard(b);
    }
    
    public Board getBoardOne(int idx) {
        return m.getBoardOne(idx);
    }
    
    public boolean addReply(Reply r) {
        return m.addReply(r);
    }

    public List<Reply> getReply(int boardIdx) {
        return m.getReply(boardIdx);
    }
    
    public int updatereviewcnt(int idx) throws Exception {
		return m.updatereviewcnt(idx);
	}
    
    
    
    
}