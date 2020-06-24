package com.care.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.care.dao.MemberDAO;


@Service
public class MemberService {
	@Autowired
	private MemberDAO dao;

	public void checkLogin(String id, String pw, Model model, HttpSession session) {
		
	}
	
}
