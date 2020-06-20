package com.care.service;

import java.util.Map;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.ui.Model;

import com.care.dao.BankDAO;
import com.care.dto.BankDTO;


public class ChkDepositServiceImpl implements BankService {
	private BankDAO dao;
	public ChkDepositServiceImpl() {
		String config = "classpath:applicationJDBC.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(config);
		dao = ctx.getBean("dao", BankDAO.class);
	}
	@Override
	public void execute(Model model) {
		Map<String, Object> map = model.asMap();
		BankDTO dto = (BankDTO)map.get("dto");
		int arr[] = new int[3];
		arr = dao.depositMoney(dto);
		model.addAttribute("arr", arr);
	}

}
