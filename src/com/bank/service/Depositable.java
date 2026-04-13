package com.bank.service;

import java.util.List;

import com.bank.model.Account;

public interface Depositable {
	String deposit(List<Account> accountList,String accountId, Double amount);
}
