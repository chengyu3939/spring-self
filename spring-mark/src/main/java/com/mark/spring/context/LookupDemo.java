package com.mark.spring.context;

import com.mark.spring.bean.Student3Service;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public abstract class LookupDemo {
	@Lookup
	public abstract Student3Service getService();
}
