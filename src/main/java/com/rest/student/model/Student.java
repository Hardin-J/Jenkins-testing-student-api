package com.rest.student.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student_rest_102")
public class Student {
	
	@Id @Column(name = "stu_id") @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "Stu_name")
	private String name;
	
	@Column(name = "stu_city")
	private String city;

	@Column(name = "stu_mobile_num")
	private long mobile;
	
	@Column(name = "stu_pincode")
	private long pincode;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String city, long mobile, long pincode) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.mobile = mobile;
		this.pincode = pincode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	
}
