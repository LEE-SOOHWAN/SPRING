package com.care.board;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.care.service.MemberService;


@Controller
public class MemberController {
	@Autowired
	private MemberService service;
	
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
	@RequestMapping("sucessLogin")
	public String sucessLogin(@RequestParam String id, @RequestParam String pw, Model model, HttpSession session) {
		service.checkLogin(id, pw, model, session);
		return "member/sucessLogin";
	}
	
}
