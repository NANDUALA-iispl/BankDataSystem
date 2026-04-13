package com.bank.service;

import java.util.List;

import com.bank.model.Account;

public class AccountServiceImpl implements AccountService,Withdrawable,Depositable{
	
	@Override
	public void displayActiveAccounts(List<Account> accountList) {
		// TODO Auto-generated method stub
		accountList.stream()
		.filter(account -> account.getAccStatus() == true)
		.forEach(System.out::println);
	}

	@Override
	public void displaySavingsAccounts(List<Account> accountList) {
		// TODO Auto-generated method stub
		accountList.stream()
		.filter(account -> account.getAccType().equals("SAVINGS"))
		.forEach(System.out::println);	
		
	}

	@Override
	public String deposit(List<Account> accountList,String accountId, Double amount) {
		// TODO Auto-generated method stub
		for(Account account : accountList) {
			if(account.getAccId().equals(accountId) && amount>0) {
				account.setAccBalance(account.getAccBalance()+amount);
				return amount+" has been deposited";
			}
		}
		return "Error occured in Deposit";
	}

	@Override
	public String withdraw(List<Account> accountList,String accountId, Double amount) {
		// TODO Auto-generated method stub
		for(Account account : accountList) {
			if(account.getAccId().equals(accountId) && amount>0 && account.getAccBalance()>0 && account.getAccBalance()>amount) {
				account.setAccBalance(account.getAccBalance()-amount);
				return amount+" has been withdrawed";
			}
		}
		return "Error occured in Deposit";
		
	}

}
