package com.mark.processor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringBeanStarter {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext("com.mark.bean");
		ac.start();
		final StudentService bean = ac.getBean(StudentService.class);
		final TeacherService bean1 = ac.getBean(TeacherService.class);


		bean.test();
		bean1.test();


	}
}
