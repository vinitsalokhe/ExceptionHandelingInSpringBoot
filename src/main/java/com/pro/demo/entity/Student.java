package com.pro.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int rollNo;
	@Column(name="Stduname")
	String name;
	@Column(name="Stducity")
	String city;
	@Column(name="StdupinCode")
	int pinCode;
	
	public Student() {
		super();
	}

	public Student(int rollNo, String name, String city, int pinCode) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.city = city;
		this.pinCode = pinCode;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", city=" + city + ", pinCode=" + pinCode + "]";
	}
	
	
	
	
	
	
	
	
}
