package com.springcore.lifeciycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {

	private String subject;

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}
	@PostConstruct
	public void init() {
		System.out.println("inside init method");
	}
	@PreDestroy
	public void destory() {
		System.out.println("inside destory method");
	}
}
