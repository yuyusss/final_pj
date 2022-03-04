package com.project.board.controller;

import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.board.model.BoardVO;
import com.project.board.model.MediaVO;
import com.project.board.model.MemberVO;
import com.project.board.model.MusicalVO;
import com.project.board.model.VoteVO;
import com.project.board.service.CalendarService;
import com.project.board.service.MediaService;
import com.project.board.service.MemberService;
import com.project.board.service.MusicalService;
import com.project.board.service.WeatherService;

@Service
@Controller
public class IndexController {

    @Autowired
    MediaService service;

    @Autowired
    CalendarService calendarService;

    @Autowired
    private WeatherService weatherService;

    @Autowired
    MusicalService musicalService;
    
    @Autowired
    MemberService memberService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        ArrayList<MediaVO> mediaList = service.listAllMedia();
        model.addAttribute("mediaList", mediaList);

        ArrayList<MusicalVO> musicalList = musicalService.getAllMusical();
        model.addAttribute("musicalList", musicalList);
        
       
        return "index2";
    }

    @RequestMapping("/test")
    public String test(){
        return "index";
    }


    @RequestMapping("/vote")
    public String vote(Model model) {
        ArrayList<VoteVO> actorList = service.listAllActor();
        model.addAttribute("actorList", actorList);

        ArrayList<MusicalVO> musicalList = musicalService.getAllMusical();
        model.addAttribute("musicalList", musicalList);
		
        ArrayList<MemberVO> memberList = memberService.getAllMember();
		model.addAttribute("memberList", memberList);
        
        
		System.out.println(actorList);
        return "vote";
    }

    @RequestMapping("/voteActor/{actorNo}")
    public String voteActor(@PathVariable String actorNo, Model model,HttpSession session, HttpServletResponse write, BoardVO b)throws Exception{   	
    	VoteVO vo = service.detailActor(actorNo);
        model.addAttribute("vo", vo);

        service.voteUp(actorNo);
        String memId = (String) session.getAttribute("sid1");
		service.voteCount(memId);
    	b.setMemId(memId);
		
		System.out.println("memId 출력: " + b.getMemId());
		
		// 로그인 되어있는지 확인하는 부분. 안되어있으면 경고 메시지 출력 -> loginform 이동
		if (memId == null) {
			write.setContentType("text/html; charset=UTF-8");
			PrintWriter out_write = write.getWriter();
			out_write.println("<script>alert('회원만 사용 가능한 기능입니다.'); location.href='/loginForm';</script>");
			out_write.flush();

			return "login";

		} else {
			// 로그인이 되어있는 경우
			return "redirect:../vote";
		}
    }

    @RequestMapping("/voteMusical/{muscNo}")
    public String voteMusical(@PathVariable String muscNo, Model model)throws Exception{
        MusicalVO vo = musicalService.getMusical(muscNo);
        model.addAttribute("vo", vo);
        System.out.println(vo);
        System.out.println(vo.getGenreName());
        musicalService.voteUp(muscNo);

        return "redirect:../vote";
    }


    /*@RequestMapping("/calenList")
    @ResponseBody
    public CalendarVO calenList() throws Exception{
        CalendarVO calendarVO = new CalendarVO();
        calendarVO.setCalTitle("캘린더 테스트");

        return calendarVO;
    }*/

    /*@RequestMapping("calenView")
    public ModelAndView calenView (HttpServletRequest request, ModelMap modelMap, @ModelAttribute CalendarVO vo)throws Exception{
         HashMap resultMap = new HashMap();
         ModelAndView mv = new ModelAndView();
         CalendarVO result = calendarService.calenView(vo);
    }*/

    // 캘린더 db에서 불러올 코드 필요
    // json parsing 사용. responsebody 사용해서 페이지 로드 시 바로 불러오게 할 것

}
