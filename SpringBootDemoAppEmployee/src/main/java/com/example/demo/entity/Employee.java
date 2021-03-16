package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Empls")
public class Employee {
	@Id
	@GeneratedValue
	@Column(length=10)
	private int employeeId;
	@Column(length=10)
	private String employeeName;
	@Column(length=20)
	private int employeeSal;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeSal() {
		return employeeSal;
	}
	public void setEmployeeSal(int employeeSal) {
		this.employeeSal = employeeSal;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSal=" + employeeSal
				+ "]";
	}
	public Employee(int employeeId, String employeeName, int employeeSal) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSal = employeeSal;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
