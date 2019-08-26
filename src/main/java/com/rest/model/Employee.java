package com.rest.model;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Employee {
	private int empId;
	private String empName;
	private int empSal;
	private Department dept;
	private Address address;
	
	public Employee() {
		
	}
	public Employee(int empId, String empName, int empSal, Department dept, Address address) {
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.dept = dept;
		this.address = address;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpSal() {
		return empSal;
	}
	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", dept=" + dept
				+ ", address=" + address + "]";
	}
}
