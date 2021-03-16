package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeService {
	int addEmployee(Employee emp);

	Employee updateEmployee(Employee emp);

	void removeEmployee(int employeeId);

	Employee getEmployeeById(int employeeId);

	List<Employee> getAllEmployees();
}
