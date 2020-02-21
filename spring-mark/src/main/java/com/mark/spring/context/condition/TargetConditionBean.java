package com.mark.spring.context.condition;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

/**
 * @author machaoma
 * @date 2020/2/21 2:54 下午
 */
@Component
@Conditional(MacSystemCondition.class)
public class TargetConditionBean {
	public void init(){
		System.out.println("init!");
	}
}
