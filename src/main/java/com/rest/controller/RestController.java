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
	public List getEmpDetails() {
		List<Employee> list = new ArrayList<>();
		List<Employee> temp = new ArrayList<>();
		list = empService.Read();
		System.out.println(list);
		for(Employee emp : list) {
			temp.add(emp);
		}
		return temp;
	}
	/*@PutMapping("/putEmployee")*/
	@GetMapping("/putEmployee")
	public List setEmployeeDetails() {
		dept = new Department(1, "ERS");
		address = new Address("02-41", "Elcot Sez", "Chennai", "India");
		employee = new Employee(1, "John", 12000, dept, address);
		empService.Create(employee);
		dept1 = new Department(2, "Apps");
		address1 = new Address("02-41", "Elcot Sez", "Chennai", "India");
		employee1 = new Employee(2, "Bell", 10000, dept1, address1);
		empService.Create(employee1);
		System.out.println(employee1.toString());
		List<Employee> list = new ArrayList<>();
		list.add(employee);
		list.add(employee1);
		return list;
	}
	
	
}
