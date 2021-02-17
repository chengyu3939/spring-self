package com.mark.spring.context;

import com.mark.spring.context.condition.TargetConditionBean;
import com.mark.spring.context.event.EventPublisher;
import com.mark.spring.context.event.MonitorEnums;
import com.mark.spring.context.event.MonitorEvent;
import com.mark.spring.context.lifecycle.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.io.InputStream;

public class SpringInit {
	public static void main(String[] args) throws IOException, InterruptedException {

//		System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"/Users/mark/Desktop");
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		System.out.println("main 方法线程"+Thread.currentThread().getName());


		LookupDemo lookupDemo= (LookupDemo) ac.getBean("lookupDemo");
		Student3Service service = lookupDemo.getService();
		Student3Service studentService = (Student3Service) ac.getBean("student3Service");
		Student2Service studentService2 = (Student2Service) ac.getBean("student2Service");
		Student3Service studentService3 = (Student3Service) ac.getBean("student3Service");

		System.out.println(studentService);
		System.out.println(studentService2);
		System.out.println(studentService3);

		//ac.publishEvent(new ApplicationEvent(new String("我发布了一个时间！")){});
//		ac.publishEvent(new MyEvent(new String("我发布了一个时间！")){});

//		studentService.say();
//		System.out.println("studentService.getClass().getClassLoader() = " + studentService.getClass().getClassLoader());

//		TargetConditionBean targetConditionBean = ac.getBean(TargetConditionBean.class);
//		targetConditionBean.init();


		//ac.publishEvent(new ApplicationEvent(new String("我发布了一个时间！")){});
		ac.publishEvent(new MonitorEvent(MonitorEnums.POOL_FAIL,"测试发布时间哦！"){});

//		EventPublisher.publisher(MonitorEnums.POOL_FAIL,"22222222");

//		runtime(ac);
//		ac.publishEvent("xxxxx");
//		System.in.read();



//		ac.registerBean();

	}

	private static void runtime(AnnotationConfigApplicationContext ac) throws IOException {
		Runtime.getRuntime().addShutdownHook(new Thread(() -> {

			System.out.println("shutdown!!!!!!!!");
			StudentService studentService2 = (StudentService) ac.getBean("studentService");
			studentService2.say();
		}));

		System.out.println("Runtime.getRuntime().availableProcessors() = " + Runtime.getRuntime().availableProcessors());


		Process ll = Runtime.getRuntime().exec("ls");
		InputStream input=ll.getInputStream();
		StringBuffer out = new StringBuffer();
		byte[] b = new byte[4096];
		for (int n; (n = input.read(b)) != -1;) {
			out.append(new String(b, 0, n));
		}
		System.out.println(out.toString());
	}
}
