package com.mark.spring.context;

import com.mark.spring.context.condition.TargetConditionBean;
import com.mark.spring.context.lifecycle.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringInit {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);

		StudentService studentService= (StudentService) ac.getBean("studentService");
		studentService.say();

		TargetConditionBean targetConditionBean=ac.getBean(TargetConditionBean.class);
		targetConditionBean.init();


	}
}
