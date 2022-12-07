package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext ob = new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
		Emp e =(Emp) ob.getBean("emp1");
		System.out.println(e.getName());
		System.out.println(e.getPhones());
		System.out.println(e.getAddresses());
		System.out.println(e.getCoureses());
		System.out.println(e.getPhones().getClass().getName());
	}

}
