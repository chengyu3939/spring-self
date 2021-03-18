package com.mark.spring.event;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Iterator;

@Component
public class ContextRefreshedListener implements ApplicationListener<ContextRefreshedEvent> {

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {

		final AbstractApplicationContext applicationContext = (AbstractApplicationContext) event.getApplicationContext();
		final ConfigurableListableBeanFactory beanFactory = applicationContext.getBeanFactory();

		System.out.println(beanFactory.getSingletonCount());

		final Iterator<String> beanNamesIterator = beanFactory.getBeanNamesIterator();

		beanNamesIterator.forEachRemaining(i -> {


//			System.out.println("beanName:" + i);


			if (beanFactory.containsBeanDefinition(i)) {

				final BeanDefinition beanDefinition = beanFactory.getBeanDefinition(i);

				if (beanDefinition instanceof AbstractBeanDefinition) {

					AbstractBeanDefinition definition = (AbstractBeanDefinition) beanDefinition;


					if (definition.hasBeanClass()) {
						final Class<?> beanClass = definition.getBeanClass();
						System.out.println(beanClass.getName());

					} else {
//			student2Service.getResource()
//			final Class<?> aClass = ac.getClassLoader().loadClass(student2Service.getResource().getFile().getAbsolutePath());


						try {
							final URLClassLoader urlClassLoader = new URLClassLoader(new URL[]{definition.getResource().getURL()});

							final Class<?> aClass1;
							aClass1 = urlClassLoader.loadClass(definition.getBeanClassName());

							for (Method method : aClass1.getDeclaredMethods()) {
								System.out.println("class :" + aClass1.getName() + " method :" + method.getName() + " return: " + method.getReturnType().getName());

							}
						} catch (ClassNotFoundException | IOException e) {
							e.printStackTrace();
						}

					}
				}


			}
			;


		});
		System.out.println("ContextRefreshedListener" + event);

	}
}