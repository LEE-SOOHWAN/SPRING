package com.care.test;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Test {
	@Around("execution(* com.care.controller.TestController.*(..))")
	public Object test(ProceedingJoinPoint joinpoint) throws Throwable  {
		System.out.println("Controller 실행시 출력 됩니다.");
		return joinpoint.proceed();
	}
}
