package com.example.demo.employee;

import java.util.Arrays;
import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@GetMapping("/employee")
	public List<Employee> getList() {
		return Arrays.asList(
				new Employee("100", "Kathryn Chandria Bernardo", "Human Resource"),
				new Employee("101", "Lisa Manoban", "Budget and Finance"),
				new Employee("102", "Yoon Eun Hye", "Executive")
				);
	}
		
}
