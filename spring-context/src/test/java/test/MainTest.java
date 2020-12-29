package test;

import org.springframework.context.annotation.ConfigurationClassPostProcessor;
import org.springframework.core.Conventions;

import java.util.concurrent.atomic.AtomicInteger;

public class MainTest {
	public static void main(String[] args) {
		System.out.println(Conventions.getQualifiedAttributeName(ConfigurationClassPostProcessor.class, "configurationClass"));
		AtomicInteger atomicInteger=new AtomicInteger(1);
		int i = atomicInteger.incrementAndGet();
	}
}
