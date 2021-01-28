package com.mark.bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DemoForFactoryBean implements FactoryBean {

	@Autowired
	TeacherService teacherService;

	@Override
	public Object getObject() throws Exception {
		final StudentService studentService = new StudentService();
		studentService.teacherService = teacherService;
		return studentService;
	}

	@Override
	public Class<?> getObjectType() {
		return StudentService.class;
	}
}
