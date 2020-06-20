package com.care.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.care.test02.Test02;

@Controller
public class HomeController {
	@Autowired
	//자료형을 보고 객체를 주입(이름은 딱히 중요하지 않음)
	//해당하는 컨테이너에 있는 Bean을 끌어다 사용
	//생성자가 먼저 실행이 되어 모든 코드가 처리된 후에 Autowierd가 실행 됨
	//그러므로 생성자에서 해당하는 객체에 포함되어 있는 메소드를 실행시킬 경우 에러가 뜸
	private TestClass testClass;
	
	@Autowired
	private Test02 test02;
	
	public HomeController() {
		System.out.println("======home 생성자 실행======");
		System.out.println("생성자 testClass : "+testClass);
		/*
		String config = "classpath:config/context-config.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(config);
		testClass = ctx.getBean("testClass", TestClass.class);
		testClass.print();
		*/
	}
	@RequestMapping("/")
	public String index() {
		test02.test02();
		System.out.println("test02 : "+test02);
		System.out.println("index testClass : "+testClass);
		return "home";
	}
}
