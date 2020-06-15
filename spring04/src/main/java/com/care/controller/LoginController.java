package com.care.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	//@RequestMapping(value="login", method = RequestMethod.GET)
	@GetMapping("login")	//@RequestMapping()과 같은 표현 / 버전이 4.3.4버전에서 자동완성 기능이 실행됨
	public String loginGet() {
		return "login/login";
	} 
	@PostMapping("chkuser")
	public String chkuser(
			@RequestParam("id") String id,
			@RequestParam("pwd") String pwd,
			HttpSession session) {
		String saveId="1", savePwd="1", nickName="홍길동";
		if(saveId.equals(id) && savePwd.equals(pwd)) {
			session.setAttribute("loginUser", nickName);
			return "login/main";
		}else {
			return "redirect:login";
		}
	}
	@GetMapping("logout")
	public String logout(HttpSession se) {
		se.invalidate();
		return "login/logout";
	}
}
