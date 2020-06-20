package com.care.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.care.dao.TestDAO;
import com.care.dto.TestDTO;

@Service
public class TestService {
	@Autowired
	private TestDAO dao;
	public void test(Model model) {
		model.addAttribute("lists", dao.test());
	}
	public void list(Model model, String num) {
		model.addAttribute("list", dao.list(num));
	}
	public void savedata(TestDTO dto) {
		dao.savedata(dto);
	}
	public void updatedata(TestDTO dto) {
		dao.updatedata(dto);
	}
	public void delete(TestDTO dto) {
		dao.delete(dto);
	}
}
