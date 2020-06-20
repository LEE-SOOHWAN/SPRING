package com.care.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.care.service.TestService;
import com.care.service.TestServiceImpl;
import com.care.service.TestServiceImpl02;

@Controller
public class TestController {
	//@Autowired
	//private TestServiceImpl ser;
	//@Autowired
	//private TestServiceImpl02 ser02;
	
	private TestService ser;
	
	@RequestMapping("test")
	public void test() {
		//ser = new TestServiceImpl();
		ser = (TestServiceImpl)AC.ac.getBean("testServiceImpl");
		ser.execute();
		ser = (TestServiceImpl02)AC.ac.getBean("testServiceImpl02");
		ser.execute();
	}
}
