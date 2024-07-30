package com.rest.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.student.model.Student;
import com.rest.student.serviceImpl.StudentServImpl;

@RestController
@CrossOrigin("*")
@RequestMapping("/Student")
public class StudentController {

	@Autowired
	StudentServImpl service;

	@PostMapping
	public String doInsertStudent(@RequestBody Student st) {

		String msg = "";
		try {
			msg = service.addStudent(st);
		} catch (Exception e) {
			// TODO: handle exception
			msg = "Transaction failed";
		}
		return msg;
	}

	@PutMapping
	public String doUpdateStudent(@RequestBody Student st) {

		String msg = "";
		try {
			msg = service.updateStudent(st);
		} catch (Exception e) {
			// TODO: handle exception
			msg = "Transaction failed";
		}
		return msg;
	}

	@GetMapping("{id}")
	public Student doFindStudentById(@PathVariable("id") int id) {
		Student st = service.getStudentById(id);
		return st;
	}

	@DeleteMapping("{id}")
	public String doDeleteStudentById(@PathVariable("id") int id) {
		String msg = "";
		try {
			msg = service.deleteStudent(id);
		} catch (Exception e) {
			msg = "Transaction failed";
		}
		return msg;
	}

	@GetMapping("/all")
	public List<Student> doFindStudents() {
		return service.viewAllStudents();
	}
}