package com.mark.aop.aspect;

import com.mark.aop.annotation.TestMock;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoAspect {

	@Pointcut("@annotation(com.mark.aop.annotation.TestMock)")
	public void pointcut() {

	}


	@Around(value = "pointcut()")
	public Object doSomeThing(ProceedingJoinPoint pjp) throws Throwable {

		System.out.println("before aop do something");

		final Object proceed = pjp.proceed();

		final TestMock annotation = ((MethodSignature) pjp.getSignature()).getMethod().getAnnotation(TestMock.class);
		final String value = annotation.value();
		System.out.println("  ---value---"+ value);
		System.out.println(pjp.getSignature().getName());

		System.out.println("after aop do something ");
		return proceed;
	}
}
