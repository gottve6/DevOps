package com.subbu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subbu.model.Employee;
import com.subbu.service.EmployeeRespository;

@RestController
@RequestMapping("api/v1/employees")
public class EmployeeController {

	@Autowired
	private EmployeeRespository employeeRespository;
	
	@GetMapping
	public List<Employee> getAllEmployees(){
		return employeeRespository.findAll();
	}
	
	
	@PostMapping
	public Employee createEmployee(Employee employee) {
		return employeeRespository.save(employee);
	}
}
