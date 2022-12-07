package com.springcore.springbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/springbean/springbeanconfig.xml");

		Student s1=con.getBean("ob",Student.class);
		
		System.out.println(s1.hashCode());
		
		Student s2=con.getBean("ob",Student.class);
		System.out.println(s2.hashCode());
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/springbean/springbeanconfig.xml");
	
		Teacher t1=context.getBean("teacher",Teacher.class);
		System.out.println(t1.hashCode());
		
		Teacher t2=context.getBean("teacher",Teacher.class);
		System.out.println(t2.hashCode());
	}

}
