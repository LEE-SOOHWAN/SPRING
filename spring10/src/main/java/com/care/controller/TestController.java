package com.care.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.care.dto.InfoDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class TestController {
	@GetMapping(value="rest", produces="application/text;charset=utf-8")
	public String get() {
		return "get실행 : 데이터 요청할 때 사용";
	}
	@PostMapping(value="rest", produces="application/text;charset=utf-8")
	public String post() {
		return "post실행 : 데이터 추가";
	}
	@PutMapping(value="rest", produces="application/text;charset=utf-8")
	public String put() {
		return "put실행 : 데이터 수정할 때";
	}
	@DeleteMapping(value="rest", produces="application/text;charset=utf-8")
	public String del() {
		return "del실행 : 데이터 삭제할 때 사용";
	}
	
	@GetMapping(value="user/{cnt}", produces="application/json;charset=utf-8")
	public String user(@PathVariable int cnt) throws JsonProcessingException {
		ArrayList<InfoDTO> list = new ArrayList<InfoDTO>();
		for(int i=0; i< cnt*10; i++) {
			InfoDTO info = new InfoDTO();
			info.setName("홍길동 : "+i);
			info.setAge(10+i);
			list.add(info);
		}
		ObjectMapper mapper = new ObjectMapper();
		String strJson = mapper.writeValueAsString(list);
		return strJson;
	} 
}
