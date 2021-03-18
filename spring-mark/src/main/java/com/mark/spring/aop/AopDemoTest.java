package com.mark.spring.aop;

import com.mark.spring.bean.IService;
import com.mark.spring.bean.Student2Service;
import com.mark.spring.bean.StudentService;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Map;

public class AopDemoTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AopConfig.class);


		final StudentService testService = ac.getBean("testService", StudentService.class);

		;
		System.out.println(testService.say());



	}
}
