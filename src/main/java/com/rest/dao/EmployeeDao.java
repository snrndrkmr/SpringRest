package com.rest.dao;

import java.util.ArrayList;

import com.rest.model.Employee;

public interface EmployeeDao {
	public int Create(Employee emp);
	public int Update(Employee emp);
	public void Delete(int empId);
	public ArrayList<Employee> Read();
	public Employee getById(int empID);
	public boolean isEmpty();
	public int size();
	
}
