package com.care.di_test02;
/*
 두수를 연산하는 사칙 계산기를 만드시오
 아래와 같이 각각의 클래스를 만들고 저장클래스는 연산클래스 객체와 출력클래스
 객체를 포함시켜서 만든다. 각 숫자와 연산은 입력 받아 처리한다.
 메인Main 저장Save 연산Operation 출력Print
 */
public class SaveClass {
	private int num1, num2, result;
	private String op;
	private PrintClass pc;
	private OperationClass oc;
	
	public void operationClass() {
		result = oc.operation(num1, num2, op);
	}
	
	public void printClss() {
		pc.printFunc(num1, op, num2, result);
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}

	public PrintClass getPc() {
		return pc;
	}

	public void setPc(PrintClass pc) {
		this.pc = pc;
	}

	public OperationClass getOc() {
		return oc;
	}

	public void setOc(OperationClass oc) {
		this.oc = oc;
	}
	
	
}
