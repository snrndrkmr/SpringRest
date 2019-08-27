package com.rest.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.rest.dao.EmployeeDao;
import com.rest.model.Employee;

@Configuration
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDao employ;

	@Override
	public int Create(Employee emp) {
		// TODO Auto-generated method stub
		
		return employ.Create(emp);
	}

	@Override
	public int Update(Employee emp) {
		// TODO Auto-generated method stub
		return employ.Update(emp);
	}

	@Override
	public int Delete(int empId) {
		// TODO Auto-generated method stub
		return employ.Delete(empId);
	}

	@Override
	public ArrayList<Employee> Read() {
		// TODO Auto-generated method stub
		return employ.Read();
	}

	@Override
	public Employee getById(int empID) {
		// TODO Auto-generated method stub
		return employ.getById(empID);
	}
	
	
}
