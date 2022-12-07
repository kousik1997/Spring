package com.springcore.lifeciycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/lifeciycle/config.xml");
		/*Samosa s=(Samosa) context.getBean("s1");
		System.out.println(s);
		context.registerShutdownHook();
		context.registerShutdownHook();
		
		System.out.println("==============================");
		
		ApplicationContext con= new ClassPathXmlApplicationContext("com/springcore/lifeciycle/config.xml");
		Pepsi p=(Pepsi) con.getBean("p1");
		System.out.println(p);
		
		System.out.println("==============================");
		*/
		Example e=(Example) context.getBean("e1");
		System.out.println(e);
	}
	

}
