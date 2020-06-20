package com.care.service;

import java.util.Map;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.ui.Model;

import com.care.dao.BankDAO;
import com.care.dto.BankDTO;

public class BalanceServiceImpl implements BankService{
	private BankDAO dao;
	public BalanceServiceImpl() {
		String config = "classpath:applicationJDBC.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(config);
		dao = ctx.getBean("dao", BankDAO.class);
	}
//	@Override
//	public void execute(Model model) {
//		Map<String, Object> map = model.asMap();
//		int money = (int)map.get("money");
//		model.addAttribute("list", );
//	}
	@Override
	public void execute(Model model) {
		model.addAttribute("balance", dao.balanceMoney());
	}
}
