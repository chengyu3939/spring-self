package com.mark.spring.context;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author machaoma
 * @date 2019/12/30 12:39 上午
 */

@Component
public class MyInitializingBean implements InitializingBean {
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("initializingBean be call!");
	}
}
