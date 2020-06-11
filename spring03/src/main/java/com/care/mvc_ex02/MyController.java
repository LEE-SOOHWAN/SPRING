package com.care.mvc_ex02;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.care.member.Member;

//annotation(주석)
@Controller	//경로를 받아주는 역할
//@Component	//의미없는 빈(객체)를 생성
//@Repository	//저장공간(보통dao) 빈을 생성
//@Service	//서비스 빈을 생성
public class MyController {
	public MyController() {
		System.out.println("=========객체가 만들어 지나요=========");
	}
	@RequestMapping("/index")
	public String memberIndex() {
		return "member03/index";
	}
	@RequestMapping("result")
	public String memberResult(Model model, Member member) {
		model.addAttribute("mb", member);
		return "member03/result";
	}
}
