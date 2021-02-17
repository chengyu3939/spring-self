package com.mark.spel.indexers;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Arrays {
	public static void main(String[] args) {

		int [] arr={1,2,3};

		ExpressionParser expressionParser=new SpelExpressionParser();

		System.out.println(expressionParser.parseExpression("[0]").getValue(arr));




	}
}
