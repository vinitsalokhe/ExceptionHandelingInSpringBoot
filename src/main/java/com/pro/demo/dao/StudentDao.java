package com.pro.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pro.demo.entity.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {

}
