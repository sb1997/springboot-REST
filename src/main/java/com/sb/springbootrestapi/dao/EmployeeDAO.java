package com.sb.springbootrestapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.springbootrestapi.model.Employee;
import com.sb.springbootrestapi.repository.EmployeeRepository;

//data access object
@Service
public class EmployeeDAO {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public Employee save(Employee emp) {
		return employeeRepository.save(emp);
	}
	
	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}
	
	public Employee findOne(Long empId) {
		return employeeRepository.findOne(empId);
	}
	
	public void delete(Employee emp) {
		  employeeRepository.delete(emp);
	}
}
