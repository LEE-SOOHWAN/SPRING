package com.care.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.care.dto.InfoDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class HomeController {
	@RequestMapping("non_ajax")
	public String non_ajax() {
		return "non_ajax";
	}
	
	@RequestMapping("ajax")
	public String ajax() {
		System.out.println("ajax 실행 됩니다.");
		return "ajax";
	}
	static int cnt=0;
	@RequestMapping("ajax_result")
	@ResponseBody
	public String ajax_result() {
		return ++cnt + "";
	}
	
	@RequestMapping("ajax02")
	public String ajax02() {
		return "ajax02";
	}
	@RequestMapping(value="ajax_result02", produces="application/text;charset=utf-8")
	@ResponseBody
	public String ajax_result02(InfoDTO info) {
		System.out.println("name : "+info.getName());
		System.out.println("age : "+info.getAge());
		return info.getName()+" : "+info.getAge();
	}
	
	@RequestMapping("ajax_json")
	public String ajax_json() {
		return "ajax_json";
	}
	@RequestMapping(
			value="ajax_json02", 
			//method=RequestMethod.POST, 
			produces="application/json;charset=utf-8")
	@ResponseBody
	public String ajax_json(InfoDTO info) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		String strJson = mapper.writeValueAsString(info);
		return strJson;
	}
	@GetMapping("ajax_json")
	public String ajax_json02() {
		return "ajax_json";
	}
	@GetMapping("rest01")
	public String rest() {
		return "rest01";
	}
	@RequestMapping("getuser")
	public String getuser() {
		return "getuser";
	}
	
	
}
