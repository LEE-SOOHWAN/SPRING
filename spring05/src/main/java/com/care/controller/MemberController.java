package com.care.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.care.service.JdbcContentServiceImpl;
import com.care.template.Constant;
import com.care.service.*;

@Controller
public class MemberController {
	private JdbcService jdbc;
	
	public MemberController() {
		String config = "classpath:applicationJDBC.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(config);
		JdbcTemplate template = ctx.getBean("template", JdbcTemplate.class);
		Constant.template = template;
		System.out.println("====== 멤버 컨트롤러 실행 ======");
	}
	
	@RequestMapping("content")
	public String content(Model model) {
		jdbc = new JdbcContentServiceImpl();
		jdbc.execute(model);
		return "content";
	}
	@RequestMapping("save_view")
	public String save_view() {
		return "save_view";
	}
	@RequestMapping("save")
	public String save(Model model, HttpServletRequest request) {
		model.addAttribute("request", request);
		jdbc = new JdbcSaveServiceImpl();
		jdbc.execute(model);
		return "redirect:content";
	}
	@RequestMapping("modify")
	public String modify(@RequestParam String id, Model model) {
		model.addAttribute("id",id);
		jdbc =  new JdbcModifyServiceImpl();
		jdbc.execute(model);
		return "modify";
	}
	@RequestMapping("modifySave")
	public String modifySave(HttpServletRequest request, Model model) {
		model.addAttribute("request", request);
		jdbc = new JdbcModifySaveServiceImpl();
		jdbc.execute(model);
		return "redirect:content";
	}
	@RequestMapping("delete")
	public String delelte(@RequestParam String id, Model model) {
		model.addAttribute("id", id);
		jdbc = new JdbcDeleteServiceImpl();
		jdbc.execute(model);
		return "redirect:content";
	}
}
