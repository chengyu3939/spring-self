package com.mark.spel;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SpelDemo {


	public static void main(String[] args) {
//		new SpelDemo().test();
		new SpelDemo().testObject();;
	}

	public void test() {

		ExpressionParser parser = new SpelExpressionParser();

		final Expression hello_world = parser.parseExpression("'hello world'.indexOf('w')");

		final Object value = hello_world.getValue();
		System.out.println(value);

		System.out.println("helloworld".indexOf("w"));
	}

	public void testObject() {
		StudentServiceDemo studentServiceDemo = new StudentServiceDemo();

		studentServiceDemo.setName("zhangsan");

		ExpressionParser parser = new SpelExpressionParser();
		final Expression hello_world = parser.parseExpression("name");
		final Object value = hello_world.getValue(studentServiceDemo);
		System.out.println(value);
	}
}
