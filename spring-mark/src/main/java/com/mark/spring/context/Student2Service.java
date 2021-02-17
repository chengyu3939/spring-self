package com.mark.spring.context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("testService")
public class Student2Service implements IService {

	StudentService studentService;



	 private StudentService testService;

	@Autowired
	public Student2Service(@Qualifier("testService") StudentService studentService) {
		this.studentService = studentService;
	}

	public void say() {
		System.out.println("student2 say!");
	}

	@Override
	public void doNothing() {
		System.out.println("donothing!");
	}

	public void close() {
		System.out.println("close!");
	}

	public StudentService getTestService() {
		return testService;
	}

	@Autowired
	public void setTestService(StudentService testService) {
		this.testService = testService;
	}
}
