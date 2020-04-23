package com.mark.spring.context.lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
@ComponentScan(basePackages = "com.mark.spring.context")
@EnableAsync
public class AppConfig {


	//给系统初始化一个线程池

	@Bean
	public TaskExecutor taskExecutor(){
		TaskExecutor taskExecutor=new ThreadPoolTaskExecutor();

		//不做参数处理
		return  taskExecutor;
	}
}
