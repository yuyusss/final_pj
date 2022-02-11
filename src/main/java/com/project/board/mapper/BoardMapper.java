package com.project.board.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.project.board.dao.Board;
import com.project.board.dao.Reply;


@Repository("BoardMapper")
public interface BoardMapper {
    public boolean addBoard(Board b);
    public List<Board> getBoard();
    public Board getBoardOne(int idx);
    public boolean addReply(Reply r);
    public List<Reply> getReply(int boardIdx);
    public int updatereviewcnt(int idx);
    public int count() throws Exception;
    public void deleteBoard(int idx);
}
	