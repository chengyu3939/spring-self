package com.mark.spring.context.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DemoApplicationListener implements ApplicationListener<ApplicationEvent> {
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("接收到了时间：" + event.getSource()+"当前执行线程："+Thread.currentThread().getName());
	}
}

