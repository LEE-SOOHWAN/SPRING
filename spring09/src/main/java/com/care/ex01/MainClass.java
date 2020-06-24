package com.care.ex01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String config = "classpath:applicationAOP_01.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(config);
		CoreClass tc = ctx.getBean("core", CoreClass.class);
		System.out.println("main start!!!");
		tc.corePrint();
		System.out.println("main end!!!");
	}
}
