package com.employee.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.demo.entities.Account;
import com.employee.demo.entities.Customer;

public interface AccountRepository extends JpaRepository<Account,Long> {

	
}
