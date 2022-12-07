package com.spring.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/constructor/config.xml");
		Persion p=(Persion) context.getBean("persion");
		
		Addition a=(Addition) context.getBean("add");
		
		System.out.println(p);
		a.dosum();
	}

}
