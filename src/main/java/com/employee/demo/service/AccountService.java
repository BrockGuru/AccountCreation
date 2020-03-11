package com.employee.demo.service;

import com.employee.demo.entities.Account;

public interface AccountService {
	 Account createAccount(Account account);
	 public void deleteAccount(Long Accountno);
	 Account updateAccount(Long Accountno);
}
