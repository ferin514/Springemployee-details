package com.ust.emp.employeedetails.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.emp.employeedetails.model.Employee;
import com.ust.emp.employeedetails.repository.EmployeeRepo;
@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo repo;
	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return repo.save(employee);
	}

}
