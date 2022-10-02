package com.gl.studentManagement.entity;

import javax.persistence.*;

@Entity
@Table(name="student")
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;


	@Column(name="tName")
	private String name;


	@Column(name="Department")
	private String dept;
	
	@Column(name="Country")
	private String country;

	
	public Student()
	{
		
	}
	
	public Student(String name, String dept, String country) {
		
		this.name = name;
		this.dept = dept;
		this.country = country;
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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}


	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dept=" + dept + ", country=" + country + "]";
	}
	
}
