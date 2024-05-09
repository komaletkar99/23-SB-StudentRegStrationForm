package com.element.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Timings {

	@Id
	private Integer t_id;
	private String tname;
}
