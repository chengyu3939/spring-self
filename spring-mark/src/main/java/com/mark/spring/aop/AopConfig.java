package com.mark.spring.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@ComponentScan({"com.mark.spring.bean", "com.mark.spring.aop", "com.mark.spring.event"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
@Component
@Aspect
public class AopConfig {

	@Around("execution(* com.mark.spring..*.*(..))")
	public Object demoAop(ProceedingJoinPoint joinpoint) {

		MethodInvocationProceedingJoinPoint joinPoints= (MethodInvocationProceedingJoinPoint) joinpoint;

		System.out.println("AOP " + joinpoint.getSignature().getDeclaringType().getTypeName());



		if ("com.mark.spring.bean.StudentService".equals(joinpoint.getSignature().getDeclaringType().getTypeName()) && "say".equals(joinpoint.getSignature().getName())) {


			return "wo bei fugai le !";
		}
		try {
			return joinpoint.proceed();
		} catch (Throwable throwable) {
			return throwable;
		}

	}


}
