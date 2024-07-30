package com.rest.student.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.student.model.Student;
import com.rest.student.repository.StudentRepo;
import com.rest.student.service.StudentServ;

@Service
public class StudentServImpl implements StudentServ {
		
	@Autowired
	StudentRepo repo;
	
	@Override
	public String addStudent(Student st) {
		// TODO Auto-generated method stub
		repo.save(st);
		return "Success";
	}
	
	@Override
	public List<Student> viewAllStudents() {
		return repo.findAll();
	}

	@Override
	public Student getStudentById(int id) {
		return repo.findById(id).get();
	}

	@Override
	public String updateStudent(Student st) {
		repo.save(st);
		return "Success";
	}

	@Override
	public String deleteStudent(int id) {
		repo.deleteById(id);
		return "Success";
	}

}
