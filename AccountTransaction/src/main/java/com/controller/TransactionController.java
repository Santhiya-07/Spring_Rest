package com.controller;

import org.springframework.http.ResponseEntity;
import java.time.LocalDate;
import com.bean.Transactions;
import java.util.List;

import com.dao.AccountDAO;
//Provide necessary Annotation
public class TransactionController {
	
	//Provide necessary Annotation
	private AccountDAO accountDao;
	
	//Provide necessary Annotation for the below methods and fill the code
	
	public ResponseEntity<Transactions> performTransactionOnAccount(int accountNumber, Transactions transaction) {
		return null;
	}	
	
	public ResponseEntity<List<Transactions>> retrieveTransactionDetails(int accountNumber, LocalDate startDate, LocalDate endDate)
	{
		return null;
	}

}