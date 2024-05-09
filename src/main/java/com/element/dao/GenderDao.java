package com.element.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.element.entity.Gender;

public interface GenderDao extends JpaRepository<Gender, Serializable> {
  @Query("select gname from Gender")
  public List<String> getGenderName();
}
