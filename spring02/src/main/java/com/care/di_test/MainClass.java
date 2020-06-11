package com.care.di_test;

import org.springframework.context.support.GenericXmlApplicationContext;


public class MainClass {
	public static void main(String[] args) {
		String config  = "classpath:application_test.xml";
		GenericXmlApplicationContext gtx = new GenericXmlApplicationContext(config);
		
		PrintBean prb = gtx.getBean("prb", PrintBean.class);
		//prb.setPrint("안녕하세요");
		prb.printString(prb.getPrint());
	}
}
