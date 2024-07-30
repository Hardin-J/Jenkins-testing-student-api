package com.rest.student.service;

import java.util.List;

import com.rest.student.model.Student;

public interface StudentServ  {
	
	public String addStudent(Student st);
	
	public List<Student> viewAllStudents();
	
	public Student getStudentById(int id);
	
	public String updateStudent(Student st);
	
	public String deleteStudent(int id);

}
