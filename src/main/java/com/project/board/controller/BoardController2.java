package com.project.board.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.project.board.model.BoardVO;
import com.project.board.model.BoardVO2;
import com.project.board.model.ReplyVO;
import com.project.board.model.ReplyVO2;
import com.project.board.service.BoardService2;

@Controller
public class BoardController2 {
	 	@Autowired
	    private BoardService2 s;
		private File none;
	    
	    @RequestMapping(value="/boardinformation", method=RequestMethod.GET)
	    public String board() {
	    	
	        return "board/boardinformation";
	    }
	    
	    @RequestMapping(value="/boardList2", method=RequestMethod.GET)
	    @ResponseBody
	    public List<BoardVO2> boardList2(){
	    	return s.getBoard2();
	    }
	    
	    @RequestMapping(value="/write2", method=RequestMethod.GET)
	    public String write() {
	        return "board/informationwrite";
	    }
		
	    @RequestMapping(value="/writeAction2", method=RequestMethod.POST)
	    public String writeAction2(
	            HttpServletRequest req,@RequestParam("file") MultipartFile file,Model model,
	            @RequestParam("title")String title, 
	            @RequestParam("contents")String contents, String hits,Date writedate) throws IllegalStateException, IOException {
	        
	    	//1. 파일 저장 경로 설정 : 실제 서비스 되는 위치(프로젝트 외부에 저장)
			String uploadPath="C:/springWorkspace/upload/";
			
			//2. 원본 파일 이름 알아오기
			String originalFileName=file.getOriginalFilename();
			
			
			
			 if (!file.getOriginalFilename().isEmpty()) {
		            file.transferTo(new File(uploadPath + file.getOriginalFilename()));
		        }
			//model로 저장
			model.addAttribute("originalFileName",originalFileName);
			
	        s.addBoard2(new BoardVO2(0, title, contents, file.getOriginalFilename(), hits,writedate));
	        return "board/boardinformation";

	    
	    }
	    @RequestMapping(value="/view2", method=RequestMethod.GET)
	    public String view() {
	        return "board/informationview";
	    }
		
	    @RequestMapping(value="/boardView2", method=RequestMethod.GET)
	    @ResponseBody
	    public BoardVO2 boardList2(@RequestParam("idx")int idx) throws Exception{
	        System.out.println("boardView, idx = " + idx);
	    	s.updatereviewcnt2(idx);
	    	BoardVO2 vo = s.getBoardOne2(idx);
	    	System.out.println(vo.getImage());
	    	return s.getBoardOne2(idx);
	    }
	    
		
	    
	    @RequestMapping(value="/replyList2", method=RequestMethod.GET)
	    @ResponseBody
	    public List<ReplyVO2> replyList2(@RequestParam("idx")int boardIdx){
	        return s.getReply2(boardIdx);
	    }
	    
	    @RequestMapping(value="/writeReply2", method=RequestMethod.POST)
	    public String writeReply2(
	            @RequestParam("idx")int idx,
	            @RequestParam("replyIdx")int replyIdx,
	            @RequestParam("contents")String contents) {
	        s.addReply2(new ReplyVO2(0, idx,replyIdx, contents));
	        return "redirect:view2?idx=" + idx;
	    }
	   
	    @RequestMapping(value="/boardListView2", method=RequestMethod.GET)
	    public String boardListView2() {
	        return "board/boardListView2";
	    }
		
	    @RequestMapping("/board/deleteboard2/{idx}")
		public String deleteBoard2(@PathVariable String idx) {
	    	s.deleteBoard2(idx);
			return "redirect:/boardinformation";
		}
	    
	    @RequestMapping("/board/deletereply2/{pageIdx}/{idx}")
		public String deleteReply2(@PathVariable String idx, @PathVariable String pageIdx) {
	    	System.out.println("deletereply - idx " + idx);
	    	s.deleteReply2(idx);
	    
			return "redirect:/view2?idx=" + pageIdx;
		}
	    
	    @RequestMapping("/board/update2/{idx}")
		public String updateBoardForm2(@PathVariable int idx, Model model) {
			BoardVO2 board = s.detailViewBoard2(idx);
			model.addAttribute("board", board);
			return "board/informationupdate";
		}
	    
	    @RequestMapping("/board/updateBoard2")
		public String detailViewBoard2(BoardVO2 board,@RequestParam("file") MultipartFile file,Model model) throws IllegalStateException, IOException {
	    	System.out.println(board);
	    	
	    	//1. 파일 저장 경로 설정 : 실제 서비스 되는 위치(프로젝트 외부에 저장)
			String uploadPath="C:/springWorkspace/upload/";
			
			//2. 원본 파일 이름 알아오기
			String originalFileName=file.getOriginalFilename();
			
			
			
			 if (!file.getOriginalFilename().isEmpty()) {
		            file.transferTo(new File(uploadPath + file.getOriginalFilename()));
		        }
			 
			//model로 저장
			model.addAttribute("originalFileName",originalFileName);
			board.setImage(file.getOriginalFilename());
			        
	    	
			s.updateBoard2(board);
			return "redirect:/boardinformation";
		}
	   
	    
	    
}
