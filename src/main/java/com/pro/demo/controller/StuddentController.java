package com.pro.demo.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pro.demo.entity.Student;
import com.pro.demo.services.StudentInter;

import io.micrometer.core.ipc.http.HttpSender.Response;

@RestController
@RequestMapping("/stdu-base")
public class StuddentController {

	@Autowired
	StudentInter studentinter;
	@PostMapping("/make-std")
	public Student createStudent(@RequestBody Student std) {
		return studentinter.createStudent(std);
	}
	
	@GetMapping("/find-std/{id}")
	public Student findStudentById(@PathVariable("id") int id) {
		 return studentinter.findStudentById(id);
	}
	
	}

