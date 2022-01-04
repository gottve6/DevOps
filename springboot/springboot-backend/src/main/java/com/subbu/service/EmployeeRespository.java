package com.subbu.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.subbu.model.Employee;

@Repository
public interface EmployeeRespository extends JpaRepository<Employee, Long>{

}
