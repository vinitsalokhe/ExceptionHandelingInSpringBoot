package com.pro.demo.services;

import com.pro.demo.entity.Student;

public interface StudentInter {

	Student createStudent(Student std);

	Student findStudentById(int id);

}
