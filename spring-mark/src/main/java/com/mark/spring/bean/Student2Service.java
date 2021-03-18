package com.mark.spring.bean;

import org.springframework.stereotype.Component;

@Component("student2Service")
public class Student2Service implements IService {


	public String say() {
		System.out.println("student2 say!");
		return "原始返回值";
	}

	@Override
	public void doNothing() {
		System.out.println("donothing!");
	}

	public void close() {
		System.out.println("close!");
	}


}
