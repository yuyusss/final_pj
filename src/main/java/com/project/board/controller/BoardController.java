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
import com.project.board.model.ReplyVO;
import com.project.board.service.BoardService;

@Controller
public class BoardController {
	 	@Autowired
	    private BoardService s;
	    
	    @RequestMapping(value="/board", method=RequestMethod.GET)
	    public String board() {
	    	
	        return "board/board";
	    }
		
	    @RequestMapping(value="/boardList", method=RequestMethod.GET)
	    @ResponseBody
	    public List<BoardVO> boardList(){
	    	return s.getBoard();
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
	    
	    @RequestMapping(value="/write", method=RequestMethod.GET)
	    public String write() {
	        return "board/write";
	    }
		
	    @RequestMapping(value="/writeAction", method=RequestMethod.POST)
	    public String writeAction(
	            HttpServletRequest req,@RequestParam("file") MultipartFile file,Model model,
	            @RequestParam("title")String title, 
	            @RequestParam("contents")String contents, String hits,Date writedate) throws IllegalStateException, IOException {
	        
	    	//1. 파일 저장 경로 설정 : 실제 서비스 되는 위치(프로젝트 외부에 저장)
			String uploadPath="C:/springWorkspace/upload/";
			
			//2. 원본 파일 이름 알아오기
			String originalFileName=file.getOriginalFilename();
			
			//3. 파일 생성
			File file1 = new File(uploadPath + originalFileName);
			
			//4. 서버로 전송
			file.transferTo(file1);
			
			//model로 저장
			model.addAttribute("originalFileName",originalFileName);

	        s.addBoard(new BoardVO(0, title, contents, file.getOriginalFilename(), hits,writedate));
	        return "board/board";
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

	    @RequestMapping(value="/view", method=RequestMethod.GET)
	    public String view() {
	        return "board/view";
	    }
		
	    @RequestMapping(value="/boardView", method=RequestMethod.GET)
	    @ResponseBody
	    public BoardVO boardList(@RequestParam("idx")int idx) throws Exception{
	        System.out.println("boardView, idx = " + idx);
	    	s.updatereviewcnt(idx);
	    	BoardVO vo = s.getBoardOne(idx);
	    	System.out.println(vo.getImage());
	    	return s.getBoardOne(idx);
	    }
	    
		
	    
	    @RequestMapping(value="/replyList", method=RequestMethod.GET)
	    @ResponseBody
	    public List<ReplyVO> replyList(@RequestParam("idx")int boardIdx){
	        return s.getReply(boardIdx);
	    }
	    
	    @RequestMapping(value="/writeReply", method=RequestMethod.POST)
	    public String writeReply(
	            @RequestParam("idx")int idx,
	            @RequestParam("replyIdx")int replyIdx,
	            @RequestParam("contents")String contents) {
	        s.addReply(new ReplyVO(0, idx,replyIdx, contents));
	        return "redirect:view?idx=" + idx;
	    }
	   
	    @RequestMapping(value="/boardListView", method=RequestMethod.GET)
	    public String boardListView() {
	        return "board/boardListView";
	    }
	    
	    @RequestMapping("/board/deleteboard/{idx}")
		public String deleteBoard(@PathVariable String idx) {
	    	s.deleteBoard(idx);
			return "redirect:/board";
		}
	    
	    @RequestMapping("/board/deletereply/{pageIdx}/{idx}")
		public String deleteReply(@PathVariable String idx, @PathVariable String pageIdx) {
	    	System.out.println("deletereply - idx " + idx);
	    	s.deleteReply(idx);
	    
			return "redirect:/view?idx=" + pageIdx;
		}
	    
	    
	    
	    @RequestMapping("/board/update/{idx}")
		public String updateBoardForm(@PathVariable int idx, Model model) {
			BoardVO board = s.detailViewBoard(idx);
			model.addAttribute("board", board);
			return "board/update";
		}
	    
	    @RequestMapping("/board/updateBoard")
		public String detailViewBoard(BoardVO board,@RequestParam("file") MultipartFile file,Model model) throws IllegalStateException, IOException {
	    	System.out.println(board);
	    	
	    	//1. 파일 저장 경로 설정 : 실제 서비스 되는 위치(프로젝트 외부에 저장)
			String uploadPath="C:/springWorkspace/upload/";
			
			//2. 원본 파일 이름 알아오기
			String originalFileName=file.getOriginalFilename();
			
			//3. 파일 생성
			File file1 = new File(uploadPath + originalFileName);
			
			//4. 서버로 전송
			file.transferTo(file1);
			
			//model로 저장
			model.addAttribute("originalFileName",originalFileName);
	    	
	    	
			s.updateBoard(board);
			return "redirect:/board";
		}
	    
	    
}
