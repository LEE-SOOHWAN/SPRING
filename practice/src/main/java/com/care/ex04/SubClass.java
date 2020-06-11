package com.care.ex04;

import org.springframework.context.support.GenericXmlApplicationContext;

public class SubClass {
	public void subFunc() {
		String config = "classpath:application_ex04.xml";
		GenericXmlApplicationContext gtx = new GenericXmlApplicationContext(config);
		Car car = gtx.getBean("car", Car.class);
		
		System.out.println("===서브 클래스가 속력을 냅니다===");
		car.speed();
	}
	
}
