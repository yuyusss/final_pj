package com.project.board.service;

import java.util.List;

import com.project.board.model.BoardVO2;
import com.project.board.model.ReplyVO2;

public interface IBoardService2 {
	 boolean addBoard2(BoardVO2 b);
	 List<BoardVO2> getBoard2();
	 BoardVO2 getBoardOne2(int idx);
	 boolean addReply2(ReplyVO2 r);
	 List<ReplyVO2> getReply2(int boardIdx);
	 int updatereviewcnt2(int idx);
	 int count2() throws Exception;
	 void deleteBoard2(String boardVO);
	 void updateBoard2(BoardVO2 b);
	 BoardVO2 detailViewBoard2(int Idx);
	 void deleteReply2(String replyVo);
	 
	 //public int getBoardListCnt() throws Exception;

}
