package com.care.ex02;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class CommonClass {
	@Around("within(com.care.ex02.*)")
	public void commonAop(ProceedingJoinPoint joinpoint) {
		try {
			System.out.println("======공통기능 시작======");
			joinpoint.proceed();
			System.out.println("======공통기능 종료======");
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	@Before("execution(* com.care.ex02.CoreClass.test())")
	public void beforeAdivece() {
		System.out.println("======핵심 기능 실행전 실행 됩니다======");
	}
}
