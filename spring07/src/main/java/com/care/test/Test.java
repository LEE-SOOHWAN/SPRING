package com.care.test;

import org.springframework.stereotype.Service;

@Service
public class Test {
	public Test() {
		System.out.println("======Test 생성자======");
	}
	public void testPrint() {
		System.out.println("Test.testPrint() 실행");
	}
}
