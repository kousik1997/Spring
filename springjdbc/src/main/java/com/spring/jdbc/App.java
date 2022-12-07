package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My Program started" );
        		//spring jdbc=>jdbcTemplate
        
       ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");      
       StudentDao studentDao= context.getBean("studentDao",StudentDao.class);
       
       /*
        //insert
       Student student = new Student();
       student.setId(3);
       student.setName("Payal");
       student.setCity("kolkata");
       
      int result= studentDao.insert(student);  
      
      System.out.println("Student added: "+result);
      */
       
       /*
        ///update
       Student student = new Student();
       student.setId(3);
       student.setName("payel");
       student.setCity("Dankuni");
       
       int result=studentDao.update(student);
       System.out.println("Student update: "+result);
       */
       
       /*
       //Delete
       Student student = new Student();
       student.setId(3);
       int result=studentDao.delete(student);
       System.out.println("Student Delete: "+result);
       */
       
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
}
