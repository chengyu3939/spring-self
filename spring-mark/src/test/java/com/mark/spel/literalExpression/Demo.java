package com.mark.spel.literalExpression;

import org.springframework.expression.spel.standard.SpelExpression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Demo {
	public static void main(String[] args) {
		Object value = new SpelExpressionParser().parseExpression("'hello world'").getValue();
		System.out.println(value +"  "+value.getClass().getName());

		Object value1 = new SpelExpressionParser().parseExpression("222").getValue();
		System.out.println(value1 +"  "+value1.getClass().getName());

		Object value2 = new SpelExpressionParser().parseExpression("22.22").getValue();
		System.out.println(value2 +"  "+value2.getClass().getName());

		Object value3 = new SpelExpressionParser().parseExpression("2222333.333333333333333333333333333333").getValue();
		System.out.println(value3 +"  "+value3.getClass().getName());
	}
}
