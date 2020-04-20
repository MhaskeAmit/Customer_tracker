package com.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hibernate.springdemo.entity.Customer;
import com.springdemo.dao.CustomerDao;


@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao custDao;
	
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		
		return custDao.getCustomers();
	}


	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {
		custDao.saveCustomer(theCustomer);
	}


	@Override
	@Transactional
	public Customer getCustomers(int theId) {
		
		return custDao.getCustomers(theId);
	}


	@Override
	@Transactional
	public void deleteCustomer(int theId) {
		custDao.deleteCustomer(theId);
		
	}

}
