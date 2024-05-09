package com.element.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.element.dao.CourseDao;
import com.element.dao.GenderDao;
import com.element.dao.TimingsDao;

@Service
public class StudentService {
	
	@Autowired
	private CourseDao cdao;
	
	@Autowired
	private TimingsDao tdao;
	
	@Autowired
	private GenderDao gdao;
	
	public List<String> getCourses(){
		List<String> courseName = cdao.getCourseName();
		return courseName;
	}
	
	public List<String> getTimings(){
		List<String> timingName = tdao.getTimingName();
		return timingName;
	}
	
	public List<String> getGenders(){
		List<String> genderName = gdao.getGenderName();
		return genderName;
	}

}
