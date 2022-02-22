package com.project.board.dao;

import java.util.List;


import com.project.board.model.BoardVO4;
import com.project.board.model.ReplyVO4;

public interface IBoardDAO4 {
    public boolean addBoard4(BoardVO4 b);
    public List<BoardVO4> getBoard4();
    public BoardVO4 getBoardOne4(int idx);
    public boolean addReply4(ReplyVO4 r);
    public List<ReplyVO4> getReply4(int boardIdx);
    public int updatereviewcnt4(int idx);
    public int count4() throws Exception;
    void deleteBoard4(String boardVo);
    void deleteReply4(String replyVo);
    void updateBoard4(BoardVO4 b);
    BoardVO4 detailViewBoard4(int idx);
    //public int getBoardListCnt();
    
}
	