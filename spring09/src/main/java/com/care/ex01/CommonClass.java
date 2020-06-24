package com.care.ex01;

import org.aspectj.lang.ProceedingJoinPoint;

public class CommonClass {
	public void commonAop(ProceedingJoinPoint joinpoint) {
		try {
			System.out.println("======공통기능 시작======");
			joinpoint.proceed();
			System.out.println("======공통기능 종료======");
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}
