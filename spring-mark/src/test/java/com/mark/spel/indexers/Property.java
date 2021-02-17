package com.mark.spel.indexers;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.testresources.Inventor;

import java.util.Date;

public class Property {

	public static void main(String[] args) {
		Inventor inventor=new Inventor("张三",new Date(),"CN");


		ExpressionParser expressionParser=new SpelExpressionParser();

		System.out.println(expressionParser.parseExpression("Birthdate.year+1900").getValue(inventor));

		Date date=new Date();
		System.out.println(date.getYear());

	}
}
