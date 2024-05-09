package com.element.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Course {

	@Id
	private Integer c_id;
	private String cname;
	
	
}
