package com.bank.repository;

import java.util.List;
import java.util.Scanner;

import com.bank.model.Account;

public class AccountRepositoryImpl implements AccountRepository{

	@Override
	public void displayAllAccounts(List<Account> accountList) {
		// TODO Auto-generated method stub
		for(Account acc : accountList) {
			System.out.println("---------------------------------------");
			System.out.println(acc.getAccHolderName());
			System.out.println(acc.getAccNo());
			System.out.println(acc.getAccId());
			System.out.println(acc.getAccType());
			System.out.println(acc.getAccBalance());
			System.out.println(acc.getAccStatus());
			System.out.println("---------------------------------------");
		}
	}

	@Override
	public void addAccount(Account account) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Account Holder Name: ");
		String accHolderName = scanner.nextLine();
		System.out.println("Enter Account Number: ");
		String accNumber = scanner.nextLine();
		System.out.println("Enter Account Id: ");
		String accId = scanner.nextLine();
		System.out.println("Enter Account Type (Savings/Current/Loan): ");
		String accType = scanner.nextLine();
		System.out.println("Enter Account Balance: ");
		double accBalance = scanner.nextDouble();
		boolean accountStatus = true;

	}

	@Override
	public Account displayAccountById(String accountId,List<Account> accountList) {
		// TODO Auto-generated method stub
		for(Account acc : accountList) {
			if(acc.getAccId().equals(accountId)) {
				System.out.println("---------------------------------------");
				System.out.println(acc.getAccHolderName());
				System.out.println(acc.getAccNo());
				System.out.println(acc.getAccId());
				System.out.println(acc.getAccType());
				System.out.println(acc.getAccBalance());
				System.out.println(acc.getAccStatus());
				System.out.println("---------------------------------------");
				return acc;
			}
		}
		return null;
	}

}
