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
import com.project.board.model.BoardVO3;
import com.project.board.model.ReplyVO3;
import com.project.board.service.BoardService3;

@Controller
public class BoardController3 {
	 	@Autowired
	    private BoardService3 s;
		private File none;
	    
	    @RequestMapping(value="/board3", method=RequestMethod.GET)
	    public String board() {
	    	
	        return "board/board3";
	    }
		
	    @RequestMapping(value="/boardList3", method=RequestMethod.GET)
	    @ResponseBody
	    public List<BoardVO3> boardList3(){
	    	return s.getBoard3();
	    }
	    
		/*
		 * @RequestMapping(value="/boardList", method=RequestMethod.GET)
		 * 
		 * @ResponseBody public List<BoardVO> boardList(Model model
		 * , @RequestParam(required = false, defaultValue = "1") int page
		 * , @RequestParam(required = false, defaultValue = "1") int range) throws
		 * Exception{ int listCnt = s.getBoardListCnt();
		 * 
		 * //Pagination 객체생성 Pagination pagination = new Pagination();
		 * pagination.pageInfo(page, range, listCnt);
		 * 
		 * model.addAttribute("pagination", pagination); return s.getBoard(); }
		 */
	    
	    @RequestMapping(value="/write3", method=RequestMethod.GET)
	    public String write3() {
	        return "board/write3";
	    }
		
	    @RequestMapping(value="/writeAction3", method=RequestMethod.POST)
	    public String writeAction3(
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
			
	        s.addBoard3(new BoardVO3(0, title, contents, file.getOriginalFilename(), hits,writedate));
	        return "board/board3";
	    }
	    
		/*
		 * @RequestMapping(value="/writeAction", method=RequestMethod.POST) public
		 * String writeAction( HttpServletRequest req,@RequestParam("file")
		 * MultipartFile file,
		 * 
		 * @RequestParam("title")String title,
		 * 
		 * @RequestParam("contents")String contents, String hits,Date writedate) throws
		 * IllegalStateException, IOException { String PATH =
		 * req.getSession().getServletContext().getRealPath("/") + "resources/"; if
		 * (!file.getOriginalFilename().isEmpty()) { file.transferTo(new File(PATH +
		 * file.getOriginalFilename())); } s.addBoard(new BoardVO(0, title, contents,
		 * file.getOriginalFilename(), hits,writedate)); return "board/board"; }
		 */

	    @RequestMapping(value="/view3", method=RequestMethod.GET)
	    public String view3() {
	        return "board/view3";
	    }
		
	    @RequestMapping(value="/boardView3", method=RequestMethod.GET)
	    @ResponseBody
	    public BoardVO3 boardList3(@RequestParam("idx")int idx) throws Exception{
	        System.out.println("boardView, idx = " + idx);
	    	s.updatereviewcnt3(idx);
	    	BoardVO3 vo = s.getBoardOne3(idx);
	    	System.out.println(vo.getImage());
	    	return s.getBoardOne3(idx);
	    }
	    
		
	    
	    @RequestMapping(value="/replyList3", method=RequestMethod.GET)
	    @ResponseBody
	    public List<ReplyVO3> replyList3(@RequestParam("idx")int boardIdx){
	        return s.getReply3(boardIdx);
	    }
	    
	    @RequestMapping(value="/writeReply3", method=RequestMethod.POST)
	    public String writeReply3(
	            @RequestParam("idx")int idx,
	            @RequestParam("replyIdx")int replyIdx,
	            @RequestParam("contents")String contents) {
	        s.addReply3(new ReplyVO3(0, idx,replyIdx, contents));
	        return "redirect:view3?idx=" + idx;
	    }
	   
	    @RequestMapping(value="/boardListView3", method=RequestMethod.GET)
	    public String boardListView3() {
	        return "board/boardListView3";
	    }
	    
	    @RequestMapping("/board/deleteboard3/{idx}")
		public String deleteBoard3(@PathVariable String idx) {
	    	s.deleteBoard3(idx);
			return "redirect:/board3";
		}
	    
	    @RequestMapping("/board/deletereply3/{pageIdx}/{idx}")
		public String deleteReply3(@PathVariable String idx, @PathVariable String pageIdx) {
	    	s.deleteReply3(idx);
	    
			return "redirect:/view3?idx=" + pageIdx;
		}
	    
	    
	    
	    @RequestMapping("/board/update3/{idx}")
		public String updateBoardForm3(@PathVariable int idx, Model model) {
			BoardVO3 board = s.detailViewBoard3(idx);
			model.addAttribute("board", board);
			return "board/update3";
		}
	    
	    @RequestMapping("/board/updateBoard3")
		public String detailViewBoard3(BoardVO3 board,@RequestParam("file") MultipartFile file,Model model) throws IllegalStateException, IOException {
	    	
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
			        
	    	
			s.updateBoard3(board);
			return "redirect:/board3";
		}
	    
	    
}
