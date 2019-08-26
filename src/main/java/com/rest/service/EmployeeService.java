package com.rest.service;

import java.util.ArrayList;

import com.rest.model.Employee;

public interface EmployeeService {
	public int Create(Employee emp);
	public int Update(Employee emp);
	public void Delete(int empId);
	public ArrayList<Employee> Read();
	public Employee getById(int empID);
}
