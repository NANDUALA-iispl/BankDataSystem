package com.bank.service;

import java.util.List;

import com.bank.model.Transaction;

public class TransactionServiceImpl implements TransactionService {

	@Override
	public void displayHighValueTransactions(List<Transaction> transactionList) {
		// TODO Auto-generated method stub,
		transactionList.stream().filter(tnx -> tnx.getTnxAmount() > 50000).forEach(System.out::println);
	}

	@Override
	public void displayFailedTransactions(List<Transaction> transactionList) {
		// TODO Auto-generated method stub
		transactionList.stream().filter(tnx -> tnx.getTnxStatus().equals("FAILED")).forEach(System.out::println);

	}

}
