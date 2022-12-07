package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entites.Student;

public class StudentDaoImple implements StudentDao {
	
	private JdbcTemplate jdbcTemplate;

	public int insert(Student student) {
		//insert query
		 String query="insert into student (id,name,city) values (?,?,?)";
		 int r=this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}
	
	public int update(Student student) {
		//updating query
		String query="update student set name = ? ,city = ? where id = ? ";
		int r= this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return r;
	}
	
	public int delete(Student student) {
		//deleting query
		String query="delete from student where id = ?";
		int r=this.jdbcTemplate.update(query,student.getId());
		return r;
	}

	public Student getStudent(int studentId) {
		//selecting single data
		String query="select * from student where id = ? ";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		 Student student=this.jdbcTemplate.queryForObject(query, rowMapper,studentId);
		
		return student;
	}
	
	public List<Student> getAllStudent() {
		//selecting multiple data
		String query="select * from student";
		List<Student> students=this.jdbcTemplate.query(query, new RowMapperImpl());		
		return students;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	

	

	

	
	
	

	

}
