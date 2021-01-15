package com.mark.context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringIOCTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext();



		annotationConfigApplicationContext.start();
	}
}
