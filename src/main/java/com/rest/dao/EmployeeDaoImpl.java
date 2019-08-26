package com.rest.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.rest.model.Employee;

@Configuration
public class EmployeeDaoImpl implements EmployeeDao {

	public int length = 0;

	@Autowired
	Employee employee;
	ArrayList<Employee> list = new ArrayList<>();
	/*
	 * @Autowired Address address;
	 * 
	 * @Autowired Department dept;
	 */

	@Override
	public int Create(Employee emp) {
		// TODO Auto-generated method stub
		if (emp == null) {
			return 0;
		} else {
			list.add(emp);
			length++;
			return 1;
		}
	}

	@Override
	public int Update(Employee emp) {
		Employee temp = getById(emp.getEmpId());
		if (temp == null) {
			return 0;
		} else {
			temp = emp;
			list.add(temp);
			return 1;
		}
	}

	@Override
	public void Delete(int empId) {
		// TODO Auto-generated method stub
		Employee temp = getById(empId);
		if (temp == null) {
			return;
		} else {
			list.remove(temp);
			length--;
		}

	}

	@Override
	public ArrayList<Employee> Read() {
		// TODO Auto-generated method stub

		return list;

	}

	@Override
	public Employee getById(int empID) {
		// TODO Auto-generated method stub
		Employee temp = null;
		if (isEmpty()) {
			return temp;
		} else {
			for (Employee emp : list) {
				if (emp.getEmpId() == empID) {
					temp = emp;
				}
			}
		}
		return temp;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (length == 0) {
			return true;
		}
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return length;
	}

}
