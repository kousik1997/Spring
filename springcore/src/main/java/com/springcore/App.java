package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ob =new ClassPathXmlApplicationContext("config.xml");
       Student st1 = (Student) ob.getBean("student1");
       
       System.out.println(st1);
     
    }
}
