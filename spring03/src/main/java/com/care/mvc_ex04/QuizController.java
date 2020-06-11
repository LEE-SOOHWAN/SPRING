package com.care.mvc_ex04;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.care.member.Member;

/*url접근: http://localhost:9000/mvc_ex04/...
1.로그인 페이지(id, pwd 입력. 비교값은 임의로 정할것)
	(로그인 성공시: 회원 정보 입력 이동)
	(로그인 실패시: 로그인 페이지 이동(redirect 사용))
2.회원정보 입력(이전에 만들었던 Member.java의 정보)
	모든 값을 입력하고 전송하면 입력 된 정보를 보여주는 페이지로 이동*/
@Controller
public class QuizController {
	@RequestMapping("q/login")
	public String login() {
		return "quiz/login";
	}
	
	@RequestMapping("q/join")
	public String join(HttpServletRequest request) {
		String userID = request.getParameter("id");
		String userPW = request.getParameter("pw");
		if(userID.equals("111")) {
			if(userPW.equals("111")) {
				return "quiz/join";
			}
		}
		return "redirect:login";
	}
	
	@RequestMapping("q/member")
	public String member(Model model, Member member) {
		model.addAttribute("mb", member);
		return "quiz/member";
	}
}
