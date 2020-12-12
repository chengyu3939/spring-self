package com.mark.spring.context;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

@Component
@Scope("prototype")
public class Student3Service {

	private static AtomicInteger number=new AtomicInteger(0);

	private Integer count;

	public Student3Service() {

		System.out.println("student3service null args be call!"+number.getAndAdd(1));
	}


	public void say(){
		System.out.println("student say!");
	}


}
