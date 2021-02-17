package com.mark.spring.context;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public abstract class LookupDemo {
	@Lookup
	public abstract Student3Service getService();
}
