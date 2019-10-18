package com.msccda.hotel.hotelManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.msccda.hotel.hotelManagement.dao.CustomerDao;
import com.msccda.hotel.hotelManagement.entity.Customer;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerDao customerDao;
	
	//get all customer and 
	@RequestMapping(value = "/customers", method = RequestMethod.GET)
	public List<Customer> findAllCustomer(){
		return customerDao.findAllCustomer();
	}
	
	@RequestMapping(value = "/customers/{id}", method = RequestMethod.GET)
	public Customer findCutomerById(@PathVariable int id){
		return customerDao.findCustomerById(id);
	}
	
	@RequestMapping(value = "/customers/delete/{id}", method = RequestMethod.GET)
	public String deleteCustomerById(@PathVariable int id) {
		customerDao.deleteById(id);
		return "Successfully deleted customer"+ id;
	}
	
	@RequestMapping(value = "/customers/insert", method = RequestMethod.GET)
	public Customer insertCustomer(Customer customer) {
		return  customerDao.insertCustomer(customer);
	}
}
