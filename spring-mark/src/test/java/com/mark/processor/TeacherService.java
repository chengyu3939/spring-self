package com.mark.processor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TeacherService {


	@Autowired
    StudentService studentService;


	public void test() {
		studentService.test();
		System.out.println("teacher test");
	}
}
