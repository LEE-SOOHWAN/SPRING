package com.care.transaction02;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.care.dto.BankDTO;
import com.care.service.BalanceServiceImpl;
import com.care.service.BankService;
import com.care.service.ChkDepositServiceImpl;

@Controller
public class HomeController {
	private BankService bs;
	@RequestMapping("main")
	public String main() {
		return "main";
	}
	@RequestMapping("deposit")
	public String deposit() {
		return "deposit";
	}
	@RequestMapping("chkDeposit")
	public String chkDeposit(BankDTO dto, Model model) {
		bs = new ChkDepositServiceImpl();
		model.addAttribute("dto", dto);
		bs.execute(model);
		return "main";
	}
//	@RequestMapping("balance")
//	public String balance(BankDTO dto, Model model) {
//		bs = new BalanceServiceImpl();
//		model.addAttribute("dto", dto);
//		bs.execute(model);
//		return "balance";
//	}
	@RequestMapping("balance")
	public String balance(Model model) {
		bs = new BalanceServiceImpl();
		bs.execute(model);
		return "balance";
	}
}
