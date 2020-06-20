package com.care.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Service //서비스
//@Repository //dao
@Component //의미없는 그냥 빈(객체) 등록
public class TestClass {
	//생성자
	public TestClass() {
		System.out.println("TestClass 생성자 입니다");
	}
	public void print() {
		System.out.println("TestClass.print() 메소드 입니다");
	}
}
