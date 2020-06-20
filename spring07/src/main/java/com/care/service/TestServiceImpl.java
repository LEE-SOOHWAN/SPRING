package com.care.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.care.dao.TestDAO;
@Service
public class TestServiceImpl implements TestService {
	@Autowired
	@Qualifier("ddd")
	private TestDAO dao;
	public TestServiceImpl() {
		System.out.println("ServiceImpl 생성자 실행");
	}
	@Override
	public void execute() {
		//dao = new TestDAO();
		dao.test();
	}

}
