package com.mark.aop;

import com.mark.aop.annotation.TestMock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Teacher {

	@Autowired
	IStudent student;


	@TestMock("setValue")
	public void call() {
		System.out.println("call");
		student.test();

		@TestMock
		String str=new String("");
	}
	public void doSometing(){
		System.out.println("do SomeThing");
	}
}
