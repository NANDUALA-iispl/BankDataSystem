package com.bank.repository;

import java.util.List;

import com.bank.model.Transaction;

public interface TransactionRepository {
	void displayAllTransactions(List <Transaction> transactionlist);
	public Transaction displayTransactionById(List<Transaction> transactionList,String tnxId);
	Transaction addTransaction(Transaction transaction);
	

}
