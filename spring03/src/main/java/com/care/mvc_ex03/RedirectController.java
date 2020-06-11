package com.care.mvc_ex03;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class RedirectController {
	@RequestMapping("/")
	public String image() {
		return "img_test";
	}
	@RequestMapping("re/index")
	public String index() {
		return "redirect01/index";
	}
	@RequestMapping("re/result")
	public String result(
			Model model , 
			HttpServletRequest request, 
			RedirectAttributes ra,
			HttpSession session) {
		String userId = request.getParameter("id");
		if(userId.equals("111")) {
			//model.addAttribute("login", "축하합니다!!!");
			//model이라는 값은 redirect를 통해서 넘겨줄 수 없음 
			//redirect를 통해서 다른 페이지로 넘어간 시점에서 model이라는 값은 사라짐
			ra.addFlashAttribute("login", "축하합니다!!!");
			//redirct를 통해서 값을 넘겨줄경우 위와 같이 
			//RedirectAttributes ra를 설정하고 ra.addFlashAttribute("login", "축하합니다!!!");로 값을 세팅하면 값이 넘어감
			session.setAttribute("se", "세션 값 입니다");
			//세션을 사용해서 값을 넘겨줄 경우 위와 같이 
			//HttpSession session을 설정하고 session.setAttribute("se", "세션 값 입니다");로 값을 세팅하면 값이 넘어감
			HttpSession s = request.getSession();
			//request를 이용해서도 세션을 얻어올 수 있음
			s.setAttribute("s", "새로운 세션 입니다");
			return "redirect:rsOK";	
			//resultRsOK메소드에서 return 값을 가져오기 전에 처리해야할 내용(로직)이 있을 경우
			//redirect:rsOK로 return값을 잡아주면 처리해야할 내용(로직)을 처리 후 rsOK페이지를 불러옴
			//redirect01/rsOK로 return값을 잡아주면 처리해야할 내용(로직)을 처리하지 못한채로 rsOK페이지를 불로옴
		}							
		return "redirect:rsNO";
	}
	@RequestMapping("re/rsOK")
	public String resultRsOK(Model model) {
		model.addAttribute("db", "db에서 개인정보를 가져왔습니다");
		return "redirect01/rsOK";
	}
	@RequestMapping("re/rsNO")
	public String resultRsNO() {
		return "redirect01/rsNO";
	}
}
