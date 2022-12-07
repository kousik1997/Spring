package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
	

	ApplicationContext con= new ClassPathXmlApplicationContext("com/springcore/standalone/collections/aloneconfig.xml");
	Persion p=con.getBean("persion1",Persion.class);
	System.out.println(p.getFriend());
	System.out.println(p.getFriend().getClass().getName());
	
	System.out.println("=============================");
	System.out.println(p.getFeestructure());
	System.out.println(p.getFeestructure().getClass().getName());
	
	System.out.println("=============================");
	System.out.println(p.getProperties());
	System.out.println(p.getProperties().getClass().getName());
}
}
