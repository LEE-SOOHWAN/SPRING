package com.care.test02;

import org.springframework.beans.factory.annotation.Autowired;

import com.care.test.Test;

public class Test02 {
	@Autowired
	private Test test;
	public Test02() {
		System.out.println("======Test02 생성자 입니다======");
	}
	public void test02() {
		test.testPrint();
		System.out.println("test02 메소드 실행");
	}
}
