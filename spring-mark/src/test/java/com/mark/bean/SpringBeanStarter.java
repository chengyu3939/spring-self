package com.mark.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.LiveBeansView;

public class SpringBeanStarter {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
//		ac.start();
		final StudentService bean = ac.getBean(StudentService.class);
		final TeacherService bean1 = ac.getBean(TeacherService.class);


		bean1.test();
		bean.test();
		System.out.println(new LiveBeansView().getSnapshotAsJson());
	}
}
