package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Employee;

public interface EmployeeDao {
	//@Query("select min(slary) from Employee")
	//List<Employee> getLowSalary();

		int addEmployee(Employee emp);
	  
	  Employee updateEmployee(Employee emp);
	 
	  void removeEmployee(int employeeId);
	 
	 Employee getEmployeeById(int employeeId);
	 
	  List<Employee> getAllEmployees();
	 
}