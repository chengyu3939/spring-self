package com.mark.spel;

import com.mark.bean.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class StudentServiceDemo {

	private String name;

    TeacherService teacherService;

	public void test() {
		System.out.println("student test");
	}

	public void doto() {
		teacherService.test();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
