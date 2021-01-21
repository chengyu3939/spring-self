package com.mark.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Teacher {

	@Autowired
	IStudent student;


	public void call() {
		System.out.println("call");
		student.test();
	}
}
