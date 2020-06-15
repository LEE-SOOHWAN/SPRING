package com.care.controller;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CookieQuizController {
	@RequestMapping("cookie01")
	public String myCookie(HttpServletRequest request,
			@CookieValue(value="myCookie",required=false) Cookie cook){
		request.setAttribute("cook", cook);
		return "cookie_quiz/cookie";
	}
	@RequestMapping("popup01")
	public String popup() {
		return "cookie_quiz/popup";
	}
	
//	@RequestMapping("cq/cookie02")
//	public String myCookie02(HttpServletResponse response, Model model,
//			@CookieValue(value="myCookie",required=false) Cookie cook){
//		System.out.println("======쿠키 코드 실행====== ");
//		if(cook != null )
//			model.addAttribute("cook",cook.getValue());
//		System.out.println(cook);
//		return "cookie_quiz/cookie";
//	}
	@RequestMapping("cookieChk")
	public String cookieChk(HttpServletResponse response,
			HttpServletRequest request,
			@CookieValue(value="myCookie",required=false) Cookie cook) {
		System.out.println("쿠키어디?");
		Cookie cookie = new Cookie("myCookie", "나의쿠키");
		cookie.setMaxAge(10);
		request.setAttribute("cook", cook);
//		cook.setPath("/");
		response.addCookie(cookie);
		return "cookie_quiz/end";
	}


	
}
