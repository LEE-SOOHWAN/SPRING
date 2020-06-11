package com.care.interface_test;

import org.springframework.context.support.GenericXmlApplicationContext;

/*StudentClass는 Student 인터페이스를 상속받는다
Student 인터페이스는 public void execute() 메소드가 존재하며 
해당 메소드는 PrintClass의 출력 부분으로 이동하는 기능을 담당한다
StudentClass 멤버 변수는 이름을 저장하는 공간과, 좋아하는 음식을 저장하기 위한 변수가 있으며
좋아하는 음식은 ArrayList로 만들며 3개의 값을 저장할 것이다
PrintClass의 출력하는 메소드에서는 모든 값을 출력한다

Properties 파일을 생성하여 각각의 값을 아래와 같이 초기화 후 출력하면 된다.
이름은 생성자를 통해서 초기화하며 좋아하는 음식은 셋터를 이용하여 3가지 음식을 초기화한다*/
public class MainClass {
	public static void main(String[] args) {
		String config  = "classpath:applicationStudent.xml";
		GenericXmlApplicationContext gtx = new GenericXmlApplicationContext(config);
		
		StudentClass sc = gtx.getBean("sc01", StudentClass.class);
		sc.execute();
	}
}
