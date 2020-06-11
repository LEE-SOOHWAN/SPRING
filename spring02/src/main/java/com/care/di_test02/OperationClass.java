package com.care.di_test02;

public class OperationClass {
	public int operation(int num1, int num2, String op) {
		int operation = 0;
		if(op.equals("+")) {
			operation = num1+num2;
		}else if(op.equals("-")) {
			operation = num1-num2;
		}else if(op.equals("*")) {
			operation = num1*num2;
		}else if(op.equals("/")){
			operation = num1/num2;
		}
		return operation;
	}
}
