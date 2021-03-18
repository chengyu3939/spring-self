package com.mark.spring.context.event;


import org.springframework.context.ApplicationEvent;

import java.io.Serializable;

public class MonitorEvent extends ApplicationEvent implements Serializable {

	private MonitorEnums monitorEnums;

	private String msg;

	public MonitorEvent(MonitorEnums monitorEnums, String msg) {
		super(monitorEnums);
		this.monitorEnums = monitorEnums;
		this.msg = msg;
	}

	public MonitorEnums getMonitorEnums() {
		return monitorEnums;
	}

	public void setMonitorEnums(MonitorEnums monitorEnums) {
		this.monitorEnums = monitorEnums;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
