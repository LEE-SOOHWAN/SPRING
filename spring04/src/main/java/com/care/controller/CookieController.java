package com.care.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CookieController {
	@RequestMapping("cookie")
	public String mycookie(HttpServletResponse response,
			@CookieValue(value="myCookie", required = false) Cookie cook,
			//해당하는 쿠키값(myCookie)을 뒤에 있는 변수(cook)에 저장
			HttpServletRequest request) {
		Cookie[] cs = request.getCookies();
		if(cs.length != 0) {
			for(Cookie c : cs) {
				System.out.println(c.getValue()+":"+c.getName());
			}
		}
		System.out.println("cook : "+cook);
		Cookie cookie = new Cookie("myCookie", "쿠키생성");
		cookie.setMaxAge(5);
		response.addCookie(cookie);
		return "cookie";
	}
	@RequestMapping("popup")
	public String popup() {
		return "popup";
	}
	@RequestMapping("popup_close")
	public String popup_close() {
		return "popup_close";
	}
}
