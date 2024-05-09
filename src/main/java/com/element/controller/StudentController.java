package com.element.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

import com.element.bind.Student;
import com.element.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService service;
	@GetMapping("/loadForm")
	public String loadRegForm(Model model) {
	    model.addAttribute("c", service.getCourses());
		model.addAttribute("t", service.getTimings());
		model.addAttribute("g", service.getGenders());
		
		model.addAttribute("reg", new Student());
		return "form";
	}
	
	@PostMapping("/saveStudent")
	public String saveStu(Student student) {
		System.out.println(student);
		return "sucess";
	}
	
}
