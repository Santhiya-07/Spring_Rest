package com.bean;

import java.util.*;
import java.time.LocalDate;

public class Account {

	private int accountNumber;
	private String holderName;
	private LocalDate accountDate;
	private double balance;
	
	private List<Transactions> transactionList = new ArrayList<Transactions>();
	
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public LocalDate getAccountDate() {
		return accountDate;
	}
	public void setAccountDate(LocalDate accountDate) {
		this.accountDate = accountDate;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public List<Transactions> getTransactionList() {
		return transactionList;
	}
	public void setTransactionList(List<Transactions> transactionList) {
		this.transactionList = transactionList;
	}

    public Account(int accountNumber, String holderName, LocalDate accountDate, double balance,
			List<Transactions> transactionList) {
		super();
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.accountDate = accountDate;
		this.balance = balance;
		this.transactionList = transactionList;
	}
	
	public Account() {
		super();
	}

	
}
