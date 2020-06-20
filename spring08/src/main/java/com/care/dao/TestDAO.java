package com.care.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.care.dto.TestDTO;

@Repository
public class TestDAO {
	@Autowired
	private SqlSession sqlSession;
	public static final String namespace="com.care.mybatis.myMapper";
	
	public List<TestDTO> test(){
		return sqlSession.selectList(namespace+".listAll");
	}
	
	public TestDTO list(String num) {
		try {
			return sqlSession.selectOne(namespace+".list", num);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void savedata(TestDTO dto) {
		int result = sqlSession.insert(namespace+".savedata", dto);
		System.out.println("결과값 : "+result);
	} 
	
	public void updatedata(TestDTO dto) {
		int result = sqlSession.insert(namespace+".updatedata", dto);
		System.out.println("결과값 : "+result);
	}
	
	public void delete(TestDTO dto) {
		int result = sqlSession.delete(namespace+".delete", dto);
		System.out.println("결과값 : "+result);
	}
}
