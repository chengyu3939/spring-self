package com.mark.aop;

import org.springframework.stereotype.Component;

@Component
public class IStudentImpl implements IStudent {
	@Override
	public void test() {

		System.out.println("i student!");
	}
}
