package com.test.webprojectapi;

import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstRestAPI {
	
	@GetMapping("testServer")
	public String sayHelloAPI() {
		return "Server is up and running";
	}
	@GetMapping("getAllStudents")
	public List<Student> getAllStudent(){
		List<Student> students=new LinkedList<>();
		students.add(new Student("101", "Sonu", "Address 1"));
		students.add(new Student("102", "Monu", "Address 1"));
		students.add(new Student("103", "Sumit", "Address 1"));
		students.add(new Student("104", "amit", "Address 1"));
		students.add(new Student("105", "ramit", "Address 1"));
		students.add(new Student("106", "jamit", "Address 1"));
		students.add(new Student("107", "hamit", "Address 1"));
		return students;
	}
	

}
