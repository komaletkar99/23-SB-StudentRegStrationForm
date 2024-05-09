package com.element.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.element.entity.Timings;

public interface TimingsDao extends JpaRepository<Timings, Serializable>{

	@Query("select tname from Timings")
	  public List<String> getTimingName();
}
