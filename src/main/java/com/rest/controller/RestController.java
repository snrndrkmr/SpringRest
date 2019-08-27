package com.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rest.model.Address;
import com.rest.model.Department;
import com.rest.model.Employee;
import com.rest.service.EmployeeService;

@org.springframework.web.bind.annotation.RestController	
public class RestController {
	
	Employee employee,employee1;
	Department dept,dept1;
	Address address,address1;
	
	@Autowired
	EmployeeService empService;
	
	@RequestMapping("/")
	public String hello() {
		return "Welcome to Restful services";
	}
	
	@GetMapping("/getEmployee")
	public List<Employee> getEmpDetails() {
		List<Employee> list = new ArrayList<>();
		List<Employee> temp = new ArrayList<>();
		list = empService.Read();
		for(Employee emp : list) {
			temp.add(emp);
		}
		return temp;
	}
	/*@PutMapping("/putEmployee")*/
	@GetMapping("/putEmployee")
	public String createEmployee() {
		int flag = 0;
		dept = new Department(1, "ERS");
		address = new Address("02-41", "Elcot Sez", "Chennai", "India");
		employee = new Employee(1, "John", 12000, dept, address);
		flag = empService.Create(employee);
		dept1 = new Department(2, "Apps");
		address1 = new Address("02-41", "Elcot Sez", "Chennai", "India");
		employee1 = new Employee(2, "Bell", 10000, dept1, address1);
		empService.Create(employee1);
		if(flag >0) {
			return "Employee Created Successfully";
		}
		return "Employee Not Created Successfully";
	}
	
	@GetMapping("/removeEmployee")
	public String removeEmployee() {
		int result = empService.Delete(1);
		if(result >0) {
			return "Employee Removed Successfully";
		}
		return "Employee Not Removed Successfully";
	}
	
	@GetMapping("/updateEmployee")
	public String updateEmployee() {
		dept = new Department(1, "ERS");
		address = new Address("02-41", "Elcot City", "Banglore", "India");
		employee = new Employee(1, "John", 12000, dept, address);
		int result = empService.Update(employee);
		if(result >0) {
			return "Employee Updated Successfully";
		}
		return "Employee Not Updated Successfully";
	}
	
}
