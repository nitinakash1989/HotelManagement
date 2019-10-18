package com.msccda.hotel.hotelManagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.Spri
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.msccda.hotel.hotelManagement.controller.CustomerController;
import com.msccda.hotel.hotelManagement.dao.CustomerDao;
import com.msccda.hotel.hotelManagement.entity.Customer;

@SpringBootApplication
public class HotelManagementApplication implements CommandLineRunner{
	
	@Autowired
	CustomerDao customerDao;
	
	@Autowired
	CustomerController customerController;
	Logger logger = LoggerFactory.getLogger(this.getClass());
	public static void main(String[] args) {
		SpringApplication.run(HotelManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("\nAll customers---->{}\n", customerDao.findAllCustomer());
		
		Customer customer = 
				new Customer(
						"Meenal", "Shah", 132,"Bruns","Halifax", "Nova Scotia", "M45 2N2","Canada","902-749-5589", "mshah@gmail.com");
		
		customerDao.insertCustomer(customer);
	}
	

}
