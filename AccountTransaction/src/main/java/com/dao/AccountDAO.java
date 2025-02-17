package com.dao;

import java.time.LocalDate;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bean.Account;
import com.bean.Transactions;

@Repository
public class AccountDAO {
    
    //Fill the code in all the methods

	public Account addAccount(Account account) {
		return null;
	}
	
	public Transactions performTransactionOnAccount(int accountNumber, Transactions transaction)
	{
		return null;
	}

    public List<Transactions> retrieveTransactionDetails(int accountNumber, LocalDate startDate, LocalDate endDate)
	{
		return null;
	}


}
