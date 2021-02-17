package com.mark.context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class SpringIOCTest {
	public static void main(String[] args) {
//		AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext();
//		annotationConfigApplicationContext.start();
		Class<Integer> integerClass = int.class;

		System.out.println(Arrays.toString(integerClass.getMethods()));
		System.out.println(integerClass.getTypeName());
	}
}
