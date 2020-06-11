package com.care.ex03;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String config = "classpath:application_ex03.xml";
		GenericXmlApplicationContext gtx = new GenericXmlApplicationContext(config);
		SaveClass sc = gtx.getBean("c_sc",SaveClass.class);
		
		sc.pcFunc();
		System.out.println();
		SaveClass sc01 = gtx.getBean("c_sc01",SaveClass.class);
		sc01.pcFunc();
	}
}
