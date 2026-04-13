package com.bank.service;

import java.util.List;

import com.bank.model.Account;

public interface Withdrawable {
	String withdraw(List<Account> accountList,String accountId,Double amount);
}
