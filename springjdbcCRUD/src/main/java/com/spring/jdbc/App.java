package com.spring.jdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.Student;

public class App 
{
	public void show() {

		ApplicationContext context=new AnnotationConfigApplicationContext(JdbcConfig.class);     
		StudentDao studentDao= context.getBean("studentDao",StudentDao.class);
		/*
	       //Select single row    
	       Student student=studentDao.getStudent(2);
	       System.out.println(student);
		 */

		//Select multiple row 

		List<Student> student =studentDao.getAllStudent();
		for(Student s:student) {
			System.out.println(s);
		}
	}
	public void insert() {
		ApplicationContext context=new AnnotationConfigApplicationContext(JdbcConfig.class);     
		StudentDao studentDao= context.getBean("studentDao",StudentDao.class);
		Scanner sc = new Scanner(System.in);
		//insert

		Student student = new Student();
		System.out.println("Enter your Id");
		int id = sc.nextInt();
		student.setId(id);
		System.out.println("Enter your Name");
		String name = sc.nextLine();
		student.setName(name);
		System.out.println("Enter your City");
		String city = sc.nextLine();
		student.setCity(city);

		int result= studentDao.insert(student);  


	}
	public void update() {
		ApplicationContext context=new AnnotationConfigApplicationContext(JdbcConfig.class);     
		StudentDao studentDao= context.getBean("studentDao",StudentDao.class);
		Scanner sc = new Scanner(System.in);
		///update
		Student student = new Student();
		System.out.println("Enter your Id");
		int id = sc.nextInt();
		student.setId(id);
		System.out.println("Enter your Name");
		String name = sc.nextLine();
		student.setName(name);
		System.out.println("Enter your City");
		String city = sc.nextLine();
		student.setCity(city);

		int result=studentDao.update(student);


	}
	public void delete() {
		ApplicationContext context=new AnnotationConfigApplicationContext(JdbcConfig.class);     
		StudentDao studentDao= context.getBean("studentDao",StudentDao.class);
		Scanner sc = new Scanner(System.in);
		
		//Delete
		Student student = new Student();
		System.out.println("Enter your Id");
		int id = sc.nextInt();
		student.setId(id);
		int result=studentDao.delete(student);
		

	}
	public static void main( String[] args )
	{
		App ap = new App();

		Scanner sc = new Scanner(System.in);

		System.out.println("what do you want to do?\n Select any one...");
		System.out.println("==============================");
		System.out.println("1: For View");
		System.out.println("2: For Insert");
		System.out.println("3: For Update");
		System.out.println("4: For Delete");
		System.out.println("Enter your choice:");

		int user = sc.nextInt();

		if(user==1){
			ap.show();
		}
		else if(user==2){
			ap.insert();

		}
		else if(user==3){
			ap.update();
		}
		else if(user==4) {
			ap.delete();
		}
		else {
			System.out.println("Please enter the correct value");
		}
	}
}
