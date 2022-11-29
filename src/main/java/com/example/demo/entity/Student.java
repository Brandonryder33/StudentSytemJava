package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Students")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String phono;
	private String course;
	
	
	
	
	public Student(int id, String name, String phono, String course) {
		
		this.id = id;
		this.name = name;
		this.phono = phono;
		this.course = course;
	}

	public Student() {
		
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
	public String getPhono() {
		return phono;
	}
	public void setPhono(String phono) {
		this.phono = phono;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phono=" + phono + ", course=" + course + "]";
	}
	
	
}
