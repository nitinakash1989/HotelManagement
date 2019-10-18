package com.msccda.hotel.hotelManagement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	@GeneratedValue
	private int customerId;
	private String firstName;
	private String lastName;
	private int streetNumber;
	private String streetName;
	private String city;
	private String province; 
	private String postalCode;
	private String country;
	private String phoneNumber;
	private String email;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	 
	
	public Customer(int customerId, String firstName, String lastName, int streetNumber, String streetName,
			String city, String province, String postalCode, String country, String phoneNumber, String email) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.city = city;
		this.province = province;
		this.postalCode = postalCode;
		this.country = country;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getStreetNumber() {
		return streetNumber;
	}
	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Person [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", streetNumber=" + streetNumber + ", streetName=" + streetName + ", city=" + city + ", province="
				+ province + ", postalCode=" + postalCode + ", country=" + country + ", phoneNumber=" + phoneNumber
				+ ", email=" + email + "]";
	}
}
