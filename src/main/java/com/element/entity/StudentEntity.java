package com.element.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class StudentEntity {

	@Id
	private String name;
	private String uname;
	private String pwd;
	private String city;
	private String marks;
	private String gender;
	private String course;
	private String timing;
}
