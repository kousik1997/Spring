package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class App 
{
	public static void main( String[] args )
	{
		ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
		StudentDao studentDao=context.getBean("studentDao",StudentDao.class);

		/*Student student =new Student(8,"Mo","Dankuni");
       int r=studentDao.insert(student);

       System.out.println("sucessfullye insert"+r);
		 */
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		boolean go=true;
		while(go) {
			System.out.println("PRESS 1 for add new student");
			System.out.println("PRESS 2 for display all student");
			System.out.println("PRESS 3 for get detail of singel student");
			System.out.println("PRESS 4 for delete student");
			System.out.println("PRESS 5 for update student");
			System.out.println("PRESS 6 for exit");

			try {
				int input=Integer.parseInt(br.readLine());

				switch(input) {

				case 1:{
					//add a new Student
					//taking input from user
					System.out.println("Enter User Id");
					int uId=Integer.parseInt(br.readLine());

					System.out.println("Enter User Name");
					String userName=br.readLine();

					System.out.println("Enter User city");
					String userCity=br.readLine();

					//creating student object and setting values

					Student s=new Student();
					s.setStudentId(uId);
					s.setStudentName(userName);
					s.setStudentCity(userCity);
					//
					int r= studentDao.insert(s);
					System.out.println(r+" Student added");
					System.out.println("******************************");
					System.out.println();

					break;
				}
				case 2:{
					//display all student

					System.out.println("**********************************");
					List<Student> allStudents = studentDao.getAllStudent();
					for(Student st :allStudents) {
						System.out.println("Id : "+st.getStudentId());
						System.out.println("Name : "+st.getStudentName());
						System.out.println("City : "+st.getStudentCity());
						System.out.println("________________________________");

					}
					System.out.println("**********************************");

					break;
				}
				case 3:{
					//display singel student
					System.out.println("**********************************");

					System.out.println("Enter User Id");
					int uId=Integer.parseInt(br.readLine());
					Student student =studentDao.getStudent(uId);

					System.out.println("________________________________");
					System.out.println("Id : "+student.getStudentId());
					System.out.println("Name : "+student.getStudentName());
					System.out.println("City : "+student.getStudentCity());
					System.out.println("________________________________");

					break;
				}
				case 4:{
					//Delete  student
					System.out.println("**********************************");

					System.out.println("Enter User Id");					
					int uId=Integer.parseInt(br.readLine());
					studentDao.deleteStudent(uId);
					System.out.println(uId+" Student Delete sucessfully");
					System.out.println("________________________________");


					break;
				}
				case 5:{
					//Update  student
					System.out.println("**********************************");

					System.out.println("Enter User Id");					
					int uId=Integer.parseInt(br.readLine());

					Student s=studentDao.getStudent(uId);

					System.out.println("Enter User Name");
					String userName=br.readLine();

					System.out.println("Enter User city");
					String userCity=br.readLine();
					
					s.setStudentName(userName);
					s.setStudentCity(userCity);
					
					studentDao.updateStudent(s);
					
					break;
				}
				case 6:{
					go=false;
					break;
				}
				default :{
					System.out.println("Invalid input");
				}

				}
			}catch(Exception e) {
				System.out.println(e);
			}
			System.out.println("Thank you using my application !!");

		}

	}
}
