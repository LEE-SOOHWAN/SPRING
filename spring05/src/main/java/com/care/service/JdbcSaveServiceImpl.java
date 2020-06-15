package com.care.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.care.jdbc_dao.JdbcDAO;

public class JdbcSaveServiceImpl implements JdbcService {

	@Override
	public void execute(Model model) {
		Map<String,Object> map = model.asMap();
		HttpServletRequest re = (HttpServletRequest)map.get("request");
		String id = re.getParameter("id");
		String name = re.getParameter("name");
		JdbcDAO dao = new JdbcDAO();
		dao.save(id, name);
	}
	
}
