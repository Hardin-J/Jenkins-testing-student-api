package com.rest.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.student.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
	
}
