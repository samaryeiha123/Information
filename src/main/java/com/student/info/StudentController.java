package com.student.info;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentController {

	@Autowired    
	private Students students;
	
	@GetMapping("/students")  
	public Students studentInfo()  
	{  
		return new Students(students.getFirstName(), students.getLastName());  

	} 
}
