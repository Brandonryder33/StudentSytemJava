package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Student;
import com.example.demo.service.studentService;


@Controller
public class studentController {
	@Autowired
	studentService service;
	@GetMapping("/")
	
	public String home(Model m) {
		List<Student> stu = service.getAllStudents();
		
		m.addAttribute("stu", stu);
		return "index";
	}
	@GetMapping("add_student")
	public String addStuForm()
{
	return "add_student";
}
	@PostMapping("/register")
	public String stuRegister(@ModelAttribute Student s, HttpSession session) {
		System.out.println(s);
		service.addStudent(s);
		session.setAttribute("msg", "Student added");
		return "redirect:/";
	}
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable int id, Model m) {
		Student s = service.getStuById(id);
		m.addAttribute("stu", s);
	return "edit";
	
	}
	}
