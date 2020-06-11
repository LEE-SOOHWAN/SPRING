package com.care.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller 
/*
 * 프로젝트 실행 시 포트 번호에 대한 오류가 아닌 서버에 대한 오류일 경우 Servers의 server.xml파일에서 맨 아래 모든
 * Context라인의 path를 확인 path의 이름이 동일하면 경로에 대한 충돌이 일어나서 서버가 실행이 안됨
 */
public class MyController {
	@RequestMapping("index01")
	public String memberIndex(Model model) {
		model.addAttribute("name", "홍길동입니다!!!");
		return "member/index";
	}
	@RequestMapping(value="logout") //여러개의 속성이 들어갈 경우 value=""로 명시해주어야함
	public String memberLogout() {
		return "member/logout";
		
	}
	@RequestMapping("login")
	public ModelAndView memberLogin() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("login", "로그인 페이지 입니다");
		mv.setViewName("member/login");
		return mv;
	}
}
