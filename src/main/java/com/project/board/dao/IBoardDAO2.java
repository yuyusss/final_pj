package com.project.board.dao;

import java.util.List;

import com.project.board.model.BoardVO2;
import com.project.board.model.ReplyVO2;

public interface IBoardDAO2 {
    public boolean addBoard2(BoardVO2 b);
    public List<BoardVO2> getBoard2();
    public BoardVO2 getBoardOne2(int idx);
    public boolean addReply2(ReplyVO2 r);
    public List<ReplyVO2> getReply2(int boardIdx);
    public int updatereviewcnt2(int idx);
    public int count2() throws Exception;
    void deleteBoard2(String boardVo);
    void deleteReply2(String replyVo);
    void updateBoard2(BoardVO2 b);
    BoardVO2 detailViewBoard2(int idx);
    //public int getBoardListCnt();
    
}
	