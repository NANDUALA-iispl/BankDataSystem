package com.bank.service;

import java.util.List;

import com.bank.model.Account;

public interface AccountService {
	void displayActiveAccounts(List<Account> accountList);
	void displaySavingsAccounts(List<Account> accountLIst);
}
