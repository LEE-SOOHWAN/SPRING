package com.care.service;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl02 implements TestService{

	@Override
	public void execute() {
		System.out.println("server 02 실행 입니다.");
	}

}
