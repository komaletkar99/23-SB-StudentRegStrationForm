package com.element.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.element.entity.Course;

public interface CourseDao extends JpaRepository<Course, Serializable> {

	@Query("select cname from Course")
	  public List<String> getCourseName();
	
}
