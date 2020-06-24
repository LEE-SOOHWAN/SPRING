package com.care.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.care.member_dao.MemberDAO;
import com.care.member_service.BoardContentViewServiceImpl;
import com.care.member_service.CheckServiceImpl;
import com.care.member_service.Check_ModifyServiceImpl;
import com.care.member_service.ContentViewServiceImpl;
import com.care.member_service.JoinServiceImpl;
import com.care.member_service.MemberService;
import com.care.member_service.Write_SaveServiceImpl;
import com.care.template.Constant;

@Controller
public class MemberController {
	private MemberService jdbc;
	
	public MemberController() {
		String config = "classpath:applicationJDBC02.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(config);
		JdbcTemplate template = ctx.getBean("template", JdbcTemplate.class);
		Constant.template = template;
		System.out.println("====== 멤버 컨트롤러 실행 ======");
	}
	
	@RequestMapping("index")
	public String index() {
		return "member/index";
	}
	@RequestMapping("login")
	public String login() {
		return "member/login";
	}
	@RequestMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "member/login";
	}
	@RequestMapping("successLogin")
	public String successLogin(@RequestParam String id, @RequestParam String pw, Model model, HttpSession session) {
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		CheckServiceImpl csi = new CheckServiceImpl();
		csi.execute(model, session);
		return "member/sucessLogin";
	}
	@RequestMapping("join")
	public String join() {
		return "member/join";
	}
	@RequestMapping("joinService")
	public String joinService(Model model, HttpServletRequest request) {
		model.addAttribute("request", request);
		jdbc = new JoinServiceImpl();
		jdbc.execute(model);
		return "member/login";
	}
	@RequestMapping("member_info")
	public String member_info(Model model) {
		jdbc = new ContentViewServiceImpl();
		jdbc.execute(model);
		return "member/member_info";
	}
	@RequestMapping("member_info2")
	public String member_info2(Model model)	{
		return "member/member_info2";
	}
	@RequestMapping("board")
	public String board(Model model) {
		jdbc =  new BoardContentViewServiceImpl();
		jdbc.execute(model);
		return "member/board";
	}
	@RequestMapping("write")
	public String write() {
		return "member/write";
	}
	@RequestMapping("save_write")
	public String save_write(Model model, HttpServletRequest request) {
		model.addAttribute("request", request);
		jdbc = new Write_SaveServiceImpl();
		jdbc.execute(model);
		return "member/board";
	}
	@RequestMapping("modify")
	public String modify(Model model, HttpServletRequest request) {
		model.addAttribute("request", request);
		jdbc = new Check_ModifyServiceImpl();
		jdbc.execute(model);
		return "member/modify";
	}
	
}
