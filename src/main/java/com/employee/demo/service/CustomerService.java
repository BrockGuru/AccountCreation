package com.employee.demo.service;

import java.util.List;

import com.employee.demo.entities.Customer;

public interface CustomerService {
	Customer addCustomer(Customer customer);

	List<Customer> allCustomer();

	public void deleteCustomer(Long CustomerId);

}
