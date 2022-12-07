package com.springcore;

public class Student {

	private int stuentId;
	private String studentName;
	private String studentAddress;
	
	public int getStuentId() {
		return stuentId;
	}
	
	public Student(int stuentId, String studentName, String studentAddress) {
		super();
		this.stuentId = stuentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	
	public Student() {
		super();
	}
	public void setStuentId(int stuentId) {
		this.stuentId = stuentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {	
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	@Override
	public String toString() {
		return "Student [stuentId=" + stuentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}
	
}
