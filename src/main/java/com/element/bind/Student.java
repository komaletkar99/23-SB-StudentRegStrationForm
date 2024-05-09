package com.element.bind;

import jakarta.persistence.Entity;
import lombok.Data;


public class Student {

	private String name;
	private String uname;
	private String pwd;
	private String city;
	private String marks;
	
	private String gender;
	private String course;
	private String timing;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMarks() {
		return marks;
	}
	public void setMarks(String marks) {
		this.marks = marks;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getTiming() {
		return timing;
	}
	public void setTiming(String timing) {
		this.timing = timing;
	}
	public Student(String name, String uname, String pwd, String city, String marks, String gender, String course,
			String timing) {
		super();
		this.name = name;
		this.uname = uname;
		this.pwd = pwd;
		this.city = city;
		this.marks = marks;
		this.gender = gender;
		this.course = course;
		this.timing = timing;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", uname=" + uname + ", pwd=" + pwd + ", city=" + city + ", marks=" + marks
				+ ", gender=" + gender + ", course=" + course + ", timing=" + timing + "]";
	}
	
	
}
