package com.project.board.controller;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.project.board.service.CalendarService;
import com.project.board.service.MediaService;
import com.project.board.service.MusicalService;
import com.project.board.service.WeatherService;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.board.model.BoardVO;
import com.project.board.model.MediaVO;
import com.project.board.model.MemberVO;
import com.project.board.model.MusicalVO;
import com.project.board.model.VoteVO;

import com.project.board.service.MemberService;

import org.springframework.web.bind.annotation.ResponseBody;

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


    private static final Logger log = LoggerFactory.getLogger(IndexController.class);


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
    public String vote(Model model,HttpSession session) {
        ArrayList<VoteVO> actorList = service.listAllActor();
        model.addAttribute("actorList", actorList);

        ArrayList<MusicalVO> musicalList = musicalService.getAllMusical();
        model.addAttribute("musicalList", musicalList);
		
        String sid=(String)session.getAttribute("sid1");
        System.out.println(sid);
        MemberVO memberList = memberService.getMember(sid);
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
		
		System.out.println("memId ??????: " + b.getMemId());
		
		// ????????? ??????????????? ???????????? ??????. ?????????????????? ?????? ????????? ?????? -> loginform ??????
		if (memId == null) {
			write.setContentType("text/html; charset=UTF-8");
			PrintWriter out_write = write.getWriter();
			out_write.println("<script>alert('????????? ?????? ????????? ???????????????.'); location.href='/loginForm';</script>");
			out_write.flush();

			return "login";

		} else {
			// ???????????? ???????????? ??????
			return "redirect:../vote";
		}
    }

    @RequestMapping("/voteMusical/{muscNo}")
    public String voteMusical(@PathVariable String muscNo,HttpSession session, Model model,BoardVO b)throws Exception{
        MusicalVO vo = musicalService.getMusical(muscNo);
        model.addAttribute("vo", vo);
        
        String memId = (String) session.getAttribute("sid1");
        service.voteCountB(memId);
    	b.setMemId(memId);
    	
        musicalService.voteUp(muscNo);

        return "redirect:../vote";
    }


    // ????????? db?????? ????????? ?????? ??????
    // json parsing ??????. responsebody ???????????? ????????? ?????? ??? ?????? ???????????? ??? ???
    // ?????? ???????????? ?????? ????????? ??????????????? ?????????
    @RequestMapping(value = "/ticketPlan", method = RequestMethod.GET)
    @ResponseBody
    public List<Map<String, Object>> ticketPlan(Model model) throws Exception{
        List<Map<String, Object>> list = calendarService.calenList();
        model.addAttribute("calenList", list);

        JSONObject jsonObj = new JSONObject(); // ?????????
        JSONArray jsonArr = new JSONArray(); // ?????????
        HashMap<String, Object> hash = new HashMap<String, Object>(); // ???????????? ????????? ????????? ?????? ??????


        for(int i=0; i < list.size(); i++) {
            hash.put("title", list.get(i).get("calTitle"));
            hash.put("content", list.get(i).get("calDetail"));
            hash.put("start", list.get(i).get("calStart"));
            hash.put("url", list.get(i).get("calURL"));

            jsonObj = new JSONObject(hash);
            jsonArr.add(jsonObj);
        }


        return jsonArr;
    }

    @RequestMapping("/about")
    public String about(){
        return "about";
    }

}
