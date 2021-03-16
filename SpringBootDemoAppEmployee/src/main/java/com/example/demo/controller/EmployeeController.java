package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/Empls") // optional
public class EmployeeController {// http://localhost:1234/trainee/getTrainee/123

	@Autowired
	EmployeeServiceImpl service;

	@GetMapping("/getEmployee/{eid}")
	public Employee getEmployeeById(@PathVariable("eid") int employeeId)// by default request is get
	{
		System.out.println(service.getEmployeeById(employeeId));

		return service.getEmployeeById(employeeId);
	}

	// @RequestMapping(value="/addTrainee",method=RequestMethod.POST )//this is to
	// insert
	@PostMapping("/addEmployee")
	public int addEmployee(@RequestBody Employee employee)// post request
	{
		return service.addEmployee(employee);
	}

	@PutMapping("/updateEmployee")
	public Employee updateEmployee(@RequestBody Employee employee)// post request
	{
		return service.updateEmployee(employee);
	}

	@DeleteMapping("/deleteEmployee/{eid}")
	public String deleteTrainee(@PathVariable("eid") int employeeId) // delete
	{
		service.removeEmployee(employeeId);
		return "deleted successfully";
	}

	@GetMapping("/getAllEmployee")
	public List<Employee> fetchAllEmployee() // delete
	{
		return service.getAllEmployees();

	}
}
