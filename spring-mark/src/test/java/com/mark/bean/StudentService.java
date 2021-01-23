package com.mark.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentService {

	@Autowired
	TeacherService teacherService;

	public void test() {
		System.out.println("student test");
	}

	public void doto() {
		teacherService.test();

	}
}
