package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import com.example.demo.beans.Student;
import com.example.demo.repository.StudentRepo;

@Controller
public class ControllerSpring {
	
	@Autowired
	private StudentRepo repos;
	
	@GetMapping("/index")
	public String getHome() {
		return "index";
	}
	
	@GetMapping("/insert")
	public String insert() {
		
		return "insert";
	}
	
	@PostMapping("/insertAction")
	public String insertAction(Student student,Model model) {
		System.out.println(student.getUsername());
		System.out.println(student.getPassword());
		repos.save(student);
		System.out.println("Successfully Inserted!!!");
		return "insert";
	}
	
	@GetMapping("/view")
	public String viewAll(Student student,Model model) {
		List<Student> studentList = new ArrayList<Student>();
		studentList = repos.findAll();
		model.addAttribute("studentList", studentList);
		return "view";
	}

}
