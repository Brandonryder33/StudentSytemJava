package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.studentRepo;
@Service
public class studentService {

	
	@Autowired
	studentRepo studentrepo;
		public void addStudent(Student s) {
			
			studentrepo.save(s);
		}
		public List<Student> getAllStudents(){
			return studentrepo.findAll();
		}
		public Student getStuById(int id) {
			Optional<Student> s = studentrepo.findById(id);
			if(s.isPresent()) {
				return s.get();
			}
			else {
				return null;
			}
		}
}
