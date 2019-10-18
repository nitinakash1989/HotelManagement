package com.msccda.hotel.hotelManagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.msccda.hotel.hotelManagement.entity.Customer;

@Repository
@Transactional
public class CustomerDao {
	
	@PersistenceContext
	EntityManager entityManager;
	
	public List<Customer> findAllCustomer(){
		
		TypedQuery<Customer> customers = entityManager.createNamedQuery("find_all_customers", Customer.class);
		return customers.getResultList();
	}

	public Customer findCustomerById(int id) {
		// TODO Auto-generated method stub
		return entityManager.find(Customer.class, id);
	}

	public void deleteById(int id) {
		// TODO Auto-generated method stub
		Customer customer = findCustomerById(id);
		entityManager.remove(customer);
	}

	public Customer insertCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return entityManager.merge(customer);
	}
	
}
