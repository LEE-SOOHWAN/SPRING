package com.care.member_service;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.care.member_dao.MemberDAO2;
import com.care.member_dto.MemberDTO2;

public class BoardContentViewServiceImpl implements MemberService {

	@Override
	public void execute(Model model) {
		MemberDAO2 dao2 = new MemberDAO2();
		ArrayList<MemberDTO2> list2 = dao2.list2();
		model.addAttribute("list2", list2);
	}

}
