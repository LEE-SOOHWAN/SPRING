package com.care.member_service;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;

import com.care.member_dao.MemberDAO;

public class CheckServiceImpl {
	public void execute(Model model, HttpSession session) {
		Map<String,Object> map = model.asMap();
		String id = (String)map.get("id");
		String pw = (String)map.get("pw");
		MemberDAO dao = new MemberDAO();
//		model.addAttribute("user",dao.check(id,pw));
		if (dao.check(id,pw) == 1) {
			session.setAttribute("user", id);
		}
	}
}
