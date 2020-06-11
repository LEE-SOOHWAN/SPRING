package com.care.di_test02;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClasss {
	public static void main(String[] args) {
		String config  = "classpath:application_test02.xml";
		GenericXmlApplicationContext gtx = new GenericXmlApplicationContext(config);
		
		SaveClass sc = gtx.getBean("sc",SaveClass.class);
		Scanner sc2 = new Scanner(System.in);
		
		int num1, num2;		String op; 
		System.out.println("num1 : ");
		num1 = sc2.nextInt();
		System.out.println("op : ");
		op = sc2.next();
		System.out.println("num2 : ");
		num2 = sc2.nextInt();
		
		sc.setNum1(num1);
		sc.setNum2(num2);
		sc.setOp(op);
		sc.operationClass();
		sc.printClss();
	}
}
