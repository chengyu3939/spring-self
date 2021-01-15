package com.mark.spring.context.bean;

import com.mark.spring.context.Student2Service;
import com.mark.spring.context.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DemoConfig {


	@Bean("student1")
	public StudentService init1() {
		return new StudentService(2);
	}

	@Bean("student2-1")
	public Student2Service init2(List<StudentService> studentService) {
		System.out.println("----------" + studentService.size());
		return new Student2Service();
	}
}
