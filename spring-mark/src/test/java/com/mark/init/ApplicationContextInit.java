package com.mark.init;

import com.mark.spring.context.StudentService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;

public class ApplicationContextInit {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
//		BeanPostProcessor
		ac.getBeanFactory().addBeanPostProcessor(new BeanPostProcessor() {
			@Override
			public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

				System.out.println("BeanPostProcessor - before " + beanName);
				return bean;
			}

			@Override
			public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
				System.out.println("BeanPostProcessor - after " + beanName);

				return bean;
			}
		});


		ac.addBeanFactoryPostProcessor(new BeanFactoryPostProcessor() {
			@Override
			public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

				System.out.println("beanFactoryPostProcessor be call!");
			}
		});


		ac.registerBean(DemoApplicationContextAware.class);
		ac.registerBean(StudentService.class);
		ac.refresh();
		DemoApplicationContextAware bean = ac.getBean(DemoApplicationContextAware.class);
		bean.doSomeThing();



		Runtime.getRuntime().addShutdownHook(new Thread(){
			@Override
			public void run() {

				System.out.println("shutdown hook!!!!!");
			}
		});


		Object systemProperties = ac.getBean("systemProperties");

		ac.stop();


	}
}

@Component
class DemoApplicationContextAware implements ApplicationContextAware {

	ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}


	public void doSomeThing() {
		System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));
	}
}