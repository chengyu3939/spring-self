package com.mark.spring.context;

import com.mark.spring.context.condition.TargetConditionBean;
import com.mark.spring.context.event.MyEvent;
import com.mark.spring.context.lifecycle.AppConfig;
import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class SpringInit {
	public static void main(String[] args) throws IOException, InterruptedException {

//		System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"/Users/mark/Desktop");
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("main 方法线程"+Thread.currentThread().getName());

		StudentService studentService = (StudentService) ac.getBean("studentService");
		studentService.say();

		TargetConditionBean targetConditionBean = ac.getBean(TargetConditionBean.class);
		targetConditionBean.init();


		Thread.sleep(10000);

		ac.publishEvent(new ApplicationEvent(new String("我发布了一个时间！")) {
		});


		ac.publishEvent("xxxxx");
		System.in.read();

	}
}
