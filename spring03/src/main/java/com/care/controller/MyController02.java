package com.care.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController02 {
	@RequestMapping("member02/index")
	public String memberIndex() {
		return "member02/index";
	}
	@RequestMapping(value="member02/result", method = RequestMethod.GET)	
	//method = RequestMethod.GET -> get방식으로 넘겨주는 값만 처리하겠다는 뜻(post방식으로 넘겨주면 에러뜸)
	public String memberResult(HttpServletRequest request, Model model) {
		model.addAttribute("name", request.getParameter("name"));
		model.addAttribute("age", request.getParameter("age"));
		return "member02/result";
	}
	@RequestMapping(value="member02/result", method = RequestMethod.POST)	
	//method = RequestMethod.POST -> post방식으로 넘겨주는 값만 처리하겠다는 뜻(get방식으로 넘겨주면 에러뜸)
	public String memberResultPost(
			@RequestParam("name") String name, 
			@RequestParam("age") String age, 
			Model model) {
		model.addAttribute("name", name+"post");
		model.addAttribute("age", age+"post");
		return "member02/result";
	}
}
