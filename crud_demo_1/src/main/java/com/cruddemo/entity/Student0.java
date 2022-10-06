package com.cruddemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //class is mapped to database, it is hibernate annotation
public class Student0 {
	@Id //makes the variable as primary key variable
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//The above line is for auto-increment
	private long id;
	private String name;
	private String course;
	private int fee;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}                                                                                                                                                                                                                                                                           
	public void setCourse(String course) {
		this.course = course;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
}
