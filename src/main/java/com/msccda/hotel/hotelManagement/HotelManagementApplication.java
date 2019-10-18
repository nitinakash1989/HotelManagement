package com.msccda.hotel.hotelManagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.msccda.hotel.hotelManagement.dao.CustomerDao;

@SpringBootApplication
public class HotelManagementApplication implements CommandLineRunner{
	
	@Autowired
	CustomerDao customerDao;
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	public static void main(String[] args) {
		SpringApplication.run(HotelManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("\nAll customers---->{}\n", customerDao.findAllCustomer());
	}

}
