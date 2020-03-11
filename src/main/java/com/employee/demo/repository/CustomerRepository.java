package com.employee.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.demo.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long>{

}
