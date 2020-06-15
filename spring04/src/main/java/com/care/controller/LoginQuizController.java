package com.care.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginQuizController {
	@GetMapping("lq/login")	
	public String loginGet(
			HttpServletRequest request,
			@CookieValue(value="myCookie",required=false) Cookie cook) {
		request.setAttribute("cook", cook);
		return "login_quiz/login";
	} 
	@PostMapping("lq/chkuser")
	public String chkuser(
			@RequestParam(required = false) String id,
			@RequestParam(required = false) String pwd,
			HttpSession session) {
		String saveId="1", savePwd="1", nickName="홍길동";
		if(saveId.equals(id) && savePwd.equals(pwd)) {
			session.setAttribute("loginUser", nickName);
			return "login_quiz/main";
		}else {
			return "redirect:login";
		}
	}
	@GetMapping("lq/logout")
	public String logout(HttpSession se) {
		se.invalidate();
		return "login_quiz/logout";
	}
	@GetMapping("lq/main")
	public String main() {
		return "login_quiz/main";
	}
}
