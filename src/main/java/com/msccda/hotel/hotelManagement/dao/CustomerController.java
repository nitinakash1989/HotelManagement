package com.msccda.hotel.hotelManagement.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
	
	
}
