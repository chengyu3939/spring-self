package com.mark.spring.bean;

import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

@Component("testService")
public class StudentService {

	private static AtomicInteger number = new AtomicInteger(0);

	private Integer count;

	public StudentService() {

		System.out.println("studentservice null args be call!" + number.getAndAdd(1));
	}

	public StudentService(Integer count) {
		System.out.println("studentservice 1 args be call!");

		this.count = count;
	}

	public String say() {
		System.out.println("student say!");
		return " 原始数据";
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
}
