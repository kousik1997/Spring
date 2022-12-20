package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Hibernate;
import org.springframework.orm.hibernate5.HibernateTemplate;
import com.spring.orm.entities.Student;

public class StudentDao {

	private HibernateTemplate hibernateTemplate;
	
	//save student
	
	
	//insert
	@Transactional
	public int insert(Student student) {
		
		 int r= (Integer) this.hibernateTemplate.save(student);
		return r;
		 
	}
	
	
	//get the single data(object)
	public Student getStudent(int studentId) {
		Student student=this.hibernateTemplate.get(Student.class,studentId);
		return student;
	}
	
	
	//get all students (all rows)
	public List<Student> getAllStudent(){
		List<Student> students=this.hibernateTemplate.loadAll(Student.class);
		return students;
	}	
	
	//delete the data
	@Transactional
	public void deleteStudent(int studentId) {
		Student student=this.hibernateTemplate.get(Student.class,studentId);
		this.hibernateTemplate.delete(student);
	}
		
	//update the data
	@Transactional
	public void updateStudent(Student student) {
		this.hibernateTemplate.update(student);
	}
	

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
}
