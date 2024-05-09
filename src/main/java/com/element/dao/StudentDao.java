package com.element.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.element.bind.Student;
import com.element.entity.StudentEntity;

public interface StudentDao extends JpaRepository<StudentEntity, Serializable> {

}
