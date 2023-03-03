package com.pro.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.pro.demo.dao.StudentDao;
import com.pro.demo.entity.Student;
import com.pro.demo.exception.StudentNotFoundException;

@Service
public class StudentServices implements StudentInter{

	@Autowired
	StudentDao dao;

	@Override
	public Student createStudent(Student std) {
		return dao.save(std);
	}

	@Override
	public Student findStudentById(int id) {
		return dao.findById(id).orElseThrow(() -> new StudentNotFoundException("Student Not Found"+id,HttpStatus.NOT_FOUND));
	}
}
