package com.mark.spring.context.event;


public enum MonitorEnums {
	POOL_FAIL("0001", "链接池异常"),
	THREAD_POOL_FAIL("0002", "线程池异常"),
	;
	private String type;
	private String desc;

	MonitorEnums(String type, String desc) {
		this.type = type;
		this.desc = desc;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}


}
