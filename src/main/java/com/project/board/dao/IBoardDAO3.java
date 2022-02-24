package com.project.board.dao;

import java.util.List;

import com.project.board.model.BoardVO;
import com.project.board.model.BoardVO3;
import com.project.board.model.ReplyVO3;

public interface IBoardDAO3 {
    public boolean addBoard3(BoardVO3 b);
    public List<BoardVO3> getBoard3();
    public BoardVO3 getBoardOne3(int idx);
    public boolean addReply3(ReplyVO3 r);
    public List<ReplyVO3> getReply3(int boardIdx);
    public int updatereviewcnt3(int idx);
    public int count3() throws Exception;
    void deleteBoard3(String boardVo);
    void deleteReply3(String replyVo);
    void updateBoard3(BoardVO3 b);
    BoardVO3 detailViewBoard3(int idx);
    //public int getBoardListCnt();
    
}
	