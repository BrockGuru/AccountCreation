package com.employee.demo.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name ="AccountTransaction_table")
public class AccountTransaction{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long accountTransactionId;
	private LocalDate localDate;
	private String type;
	private double amount;
	@ManyToOne
	private Account account;
	public AccountTransaction(LocalDate localDate, String type, double amount, Account account) {
		
		this.localDate = localDate.now();
		this.type = type;
		this.amount = amount;
		
	}
	public Long getAccountTransactionId() {
		return accountTransactionId;
	}
	public void setAccountTransactionId(Long accountTransactionId) {
		this.accountTransactionId = accountTransactionId;
	}
	public LocalDate getLocalDate() {
		return localDate;
	}
	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public AccountTransaction() {
		
	}
	
	

}
