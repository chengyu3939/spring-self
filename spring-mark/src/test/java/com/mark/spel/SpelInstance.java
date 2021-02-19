package com.mark.spel;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.Random;

public class SpelInstance {
	public static void main(String[] args) {
		ExpressionParser expressionParser = new SpelExpressionParser();

		EvaluationContext evaluationContext=new StandardEvaluationContext();
		evaluationContext.setVariable("object",new Object());


//		System.out.println(new Random().nextInt());
		final Object value = expressionParser.parseExpression("new java.util.Random().nextInt()").getValue();
		System.out.println(value);
	}
}
