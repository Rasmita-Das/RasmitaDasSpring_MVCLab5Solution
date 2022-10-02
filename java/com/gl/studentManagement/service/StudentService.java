package com.gl.studentManagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gl.studentManagement.entity.Student;

@Service
public interface StudentService {
	
	public List<Student> findAll();

	public Student findById(int theId);

	public void save(Student thestudent);

	public void deleteById(int theId);

}
