package com.care.dao;

import org.springframework.stereotype.Repository;

@Repository
public class TestDAO {
	public TestDAO() {
		System.out.println("dao 생성자 실행");
	}
	public void test() {
		System.out.println("데이터 베이스에 접근합니다!!!");
	}
}
