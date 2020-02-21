package com.mark.spring.context.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Objects;

/**
 * @author machaoma
 * @date 2020/2/21 2:52 下午
 */

public class MacSystemCondition implements Condition {
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		//获取上下文

		String systemName=context.getEnvironment().getProperty("os.name");

		System.out.println("当前系统");
		return Objects.equals(systemName, "Mac OS X");
	}
}
