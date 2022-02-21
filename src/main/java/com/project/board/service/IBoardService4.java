package com.project.board.service;

import java.util.List;

import com.project.board.model.BoardVO4;
import com.project.board.model.ReplyVO4;

public interface IBoardService4 {
	 boolean addBoard4(BoardVO4 b);
	 List<BoardVO4> getBoard4();
	 BoardVO4 getBoardOne4(int idx);
	 boolean addReply4(ReplyVO4 r);
	 List<ReplyVO4> getReply4(int boardIdx);
	 int updatereviewcnt4(int idx);
	 int count4() throws Exception;
	 void deleteBoard4(String boardVO);
	 void updateBoard4(BoardVO4 b);
	 BoardVO4 detailViewBoard4(int Idx);
	 void deleteReply4(String replyVo);
	 
	 //public int getBoardListCnt() throws Exception;

}
