package com.care.member_service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.care.member_dao.MemberDAO2;

public class Write_SaveServiceImpl implements MemberService {

	@Override
	public void execute(Model model) {
		Map<String,Object> map = model.asMap();
		HttpServletRequest re = (HttpServletRequest)map.get("request");
		String name = re.getParameter("name");
		String title = re.getParameter("title");
		String content = re.getParameter("content");
		MemberDAO2 dao2 = new MemberDAO2();
		dao2.write_save(name, title, content);
	}

}
