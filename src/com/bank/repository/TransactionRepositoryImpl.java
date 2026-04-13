package com.bank.repository;

import java.util.List;
import java.util.Scanner;

import com.bank.enums.Channel;
import com.bank.enums.TransactionState;
import com.bank.model.Account;
import com.bank.model.Transaction;
import com.bank.service.AccountService;
import com.bank.service.AccountServiceImpl;

public class TransactionRepositoryImpl implements TransactionRepository {

	@Override
	public Transaction displayTransactionById(List<Transaction> transactionList,String tnxId) {
		// TODO Auto-generated method stub
		for (Transaction tnx :transactionList) {
			if(tnxId == tnx.getTnxId()) {
				System.out.println("-------------------------------------------");
				System.out.println("TRANSACTION DETAILS OF "+tnx.getTnxId()+" is :");
				System.out.println(tnx.getFromAcc());
				System.out.println(tnx.getToAcc());
				System.out.println(tnx.getChannel());
				System.out.println(tnx.getTnxStatus());
				System.out.println(tnx.getTnxAmount());
				System.out.println("-------------------------------------------");
				return tnx;
			}
		}
		return null;
	}

	@Override
	public Transaction addTransaction() {
		// TODO Auto-generated method stub
		AccountService accountService = new AccountServiceImpl();
		Scanner sc = new Scanner (System.in);
		System.out.println("ENTER TRANSACTION ID : ");
		String tnxId = sc.next();
		System.out.println("ENTER FROM ACCOUNT : ");
		System.out.println("ENTER CHANNEL : ");
		Channel channel = Channel.valueOf(sc.next().toUpperCase());
		System.out.println("ENTER STATUS : ");
		TransactionState status = TransactionState.valueOf(sc.next().toUpperCase());
		System.out.println("ENTER AMOUNT : ");
		Double tnxAmount = sc.nextDouble();
		return new Transaction(tnxId, null, null, tnxAmount, channel,status);
		
	}

	@Override
	public void displayAllTransactions(List<Transaction> transactionlist) {
		// TODO Auto-generated method stub
		for(Transaction t : transactionlist) {
			System.out.println("-------------------------------------------");
			System.out.println("TRANSACTION DETAILS : "+t.getTnxId());
			System.out.println(t.getFromAcc());
			System.out.println(t.getToAcc());
			System.out.println(t.getChannel());
			System.out.println(t.getTnxStatus());
			System.out.println(t.getTnxAmount());
			System.out.println("-------------------------------------------");

		}

	}

}
