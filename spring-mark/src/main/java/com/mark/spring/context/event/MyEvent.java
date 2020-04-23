package com.mark.spring.context.event;


import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent {
	/**
	 * Constructs a prototypical Event.
	 *
	 * @param source The object on which the Event initially occurred.
	 * @throws IllegalArgumentException if source is null.
	 */
	public MyEvent(Object source) {
		super(source);
	}
}
