package com.subbu;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.subbu.model.Employee;
import com.subbu.service.EmployeeRespository;

@SpringBootApplication
public class SpringBootBackendApplication implements CommandLineRunner {
	
	private EmployeeRespository employeeRespository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		 * Employee emp=new Employee(); emp.setId(101); emp.setFirstName("venkat");
		 * emp.setLastName("gottemukkala"); emp.setEmailId("venkat@gmail.com");
		 * employeeRespository.save(emp); Employee emp2=new Employee(); emp2.setId(102);
		 * emp2.setFirstName("venu"); emp2.setLastName("gottemukkala");
		 * emp2.setEmailId("venu@gmail.com"); employeeRespository.save(emp2); Employee
		 * emp3=new Employee(); emp3.setId(103); emp3.setFirstName("vishnu");
		 * emp3.setLastName("gottemukkala"); emp3.setEmailId("vishnu@gmail.com");
		 * employeeRespository.save(emp3);
		 */
	}

}
