package com.mark.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringBeanStarter {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
//		ac.start();
		final StudentService bean = ac.getBean(StudentService.class);
		final TeacherService bean1 = ac.getBean(TeacherService.class);


		bean.test();
		bean1.test();


	}
}
