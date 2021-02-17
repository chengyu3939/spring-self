package com.mark.spring.context;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class MethodReplaceDemo implements MethodReplacer {
	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("method invoke!");
		Object invoke = method.invoke(obj, args);
		return invoke;
	}
}
