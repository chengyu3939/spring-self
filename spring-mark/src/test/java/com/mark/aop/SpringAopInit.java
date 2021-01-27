package com.mark.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAopInit {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext ac= new AnnotationConfigApplicationContext(TestConfig.class);
		final Teacher bean = ac.getBean(Teacher.class);
		bean.call();
		bean.doSometing();




	}
}



