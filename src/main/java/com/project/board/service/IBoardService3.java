package com.project.board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.board.model.BoardVO3;
import com.project.board.model.ReplyVO3;


public interface IBoardService3 {
	 boolean addBoard3(BoardVO3 b);
	 List<BoardVO3> getBoard3();
	 BoardVO3 getBoardOne3(int idx);
	 boolean addReply3(ReplyVO3 r);
	 List<ReplyVO3> getReply3(int boardIdx);
	 int updatereviewcnt3(int idx);
	 int count3() throws Exception;
	 void deleteBoard3(String boardVO);
	 void updateBoard3(BoardVO3 b);
	 BoardVO3 detailViewBoard3(int Idx);
	 void deleteReply3(String replyVo);
	 
	 //public int getBoardListCnt() throws Exception;

}
