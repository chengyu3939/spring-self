package com.mark.spring.context.bean;

import com.mark.spring.bean.StudentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfig {


	@Bean("student1")
	public StudentService init1() {
		return new StudentService(2);
	}

//	@Bean("student2-1")
//	public Student2Service init2(List<StudentService> studentService) {
//		System.out.println("----------" + studentService.size());
//		return new Student2Service();
//	}
}
