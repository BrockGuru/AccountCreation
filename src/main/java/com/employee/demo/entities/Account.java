package com.employee.demo.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Account_table")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long AccountNumber;
	private Double Balance;
	private AccountType accountType;
	@OneToOne(mappedBy = "account", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Customer customer;
	@OneToMany(mappedBy = "account", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JsonIgnore
	private List<AccountTransaction> TransactionList = new ArrayList<AccountTransaction>();

	public void addTransaction(AccountTransaction transaction) {
		TransactionList.add(transaction);
		transaction.setAccount(this);
	}

	public Account(Long accountNumber, Double balance, AccountType accountType, Customer customer) {

		AccountNumber = accountNumber;
		Balance = balance;
		this.accountType = accountType;
		this.customer = customer;
	}

	public Long getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		AccountNumber = accountNumber;
	}

	public Double getBalance() {
		return Balance;
	}

	public void setBalance(Double balance) {
		Balance = balance;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Account() {

	}

	public List<AccountTransaction> getTransactionList() {
		return TransactionList;
	}

	public void setTransactionList(List<AccountTransaction> transactionList) {
		TransactionList = transactionList;
	}

}
