package com.bank.repository;

import java.util.List;

import com.bank.model.Account;

public interface AccountRepository {
	void displayAllAccounts(List<Account> accountList);
	Account addAccount();

}
