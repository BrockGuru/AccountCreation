package com.employee.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.employee.demo.entities.Customer;
import com.employee.demo.repository.AccountRepository;
import com.employee.demo.repository.CustomerRepository;
import com.employee.demo.service.CustomerService;

public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CustomerRepository customerRepo;

	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepo.save(customer);
	}

	@Override
	public List<Customer> allCustomer() {
		// TODO Auto-generated method stub
		return customerRepo.findAll();
	}

	@Override
	public void deleteCustomer(Long CustomerId) {
		customerRepo.deleteById(CustomerId);
		
	}

}
