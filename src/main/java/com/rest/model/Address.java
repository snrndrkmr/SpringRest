package com.rest.model;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Address {
	private String doorNo;
	private String street;
	private String city;
	private String country;
	public Address() {
		
	}
	public Address(String doorNo, String street, String city, String country) {
		this.doorNo = doorNo;
		this.street = street;
		this.city = city;
		this.country = country;
	}
	public String getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", street=" + street + ", city=" + city + ", country=" + country + "]";
	}
	
}
