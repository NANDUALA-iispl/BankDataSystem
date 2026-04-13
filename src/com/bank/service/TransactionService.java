package com.bank.service;

import java.util.List;

import com.bank.model.Transaction;

public interface TransactionService {
	void displayHighValueTransactions(List<Transaction> transactionList);
	void displayFailedTransactions(List<Transaction> transactionList);
}
