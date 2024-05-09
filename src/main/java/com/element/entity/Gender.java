package com.element.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Gender {

	@Id
	private Integer g_id;
	private String gname;
	
	
}
