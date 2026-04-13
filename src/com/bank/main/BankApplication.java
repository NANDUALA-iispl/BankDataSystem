package com.bank.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bank.model.Account;
import com.bank.model.Transaction;
import com.bank.repository.AccountRepository;
import com.bank.repository.AccountRepositoryImpl;
import com.bank.repository.TransactionRepository;
import com.bank.repository.TransactionRepositoryImpl;
import com.bank.service.AccountService;
import com.bank.service.AccountServiceImpl;
import com.bank.service.TransactionService;
import com.bank.service.TransactionServiceImpl;

public class BankApplication {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Account> accountList = new ArrayList<Account>();
		List<Transaction> transactionList = new ArrayList<Transaction>();
		Scanner sc = new Scanner(System.in);
		TransactionService transactionService = new TransactionServiceImpl();
		AccountServiceImpl accountService = new AccountServiceImpl();
		TransactionRepository transactionRepository = new TransactionRepositoryImpl();
		AccountRepository accountRepository = new AccountRepositoryImpl();

		while (true) {
			System.out.println("1.create account");
			System.out.println("2.add transaction");
			System.out.println("3.deposit money");
			System.out.println("4.withdraw money");
			System.out.println("5.view all accounts");
			System.out.println("6.view all transactions");
			System.out.println("7.view transaction by id");
			System.out.println("8.view highValue transactions");
			System.out.println("9.view failed transactions");
			System.out.println("10.view savings Accounts");
			System.out.println("11.view Active accounts");

			int choice;
			try {
				choice = sc.nextInt();
				sc.nextLine();
			} catch (Exception e) {
				System.out.println("Invalid choice. Please enter a number.");
				sc.nextLine();
				continue;
			}
			switch (choice) {
			case 1:
				Account acc = accountRepository.addAccount();
				accountList.add(acc);
				break;
			case 2:
                 Transaction tnx=transactionRepository.addTransaction();
                 transactionList.add(tnx);
				break;
			case 3:
				System.out.println("enter account ID:");
				String accountId=sc.nextLine();
				System.out.println("enter money to deposit:");
				Double depositamount = sc.nextDouble();
			    accountService.deposit(accountList,accountId,depositamount);
				break;
			case 4:
				System.out.println("enter account ID:");
				String accountIdd=sc.nextLine();
				System.out.println("enter money to withdraw:");
				Double withdrawamount = sc.nextDouble();
				accountService.withdraw(accountList,accountIdd,withdrawamount);
				break;
			case 5:
               accountRepository.displayAllAccounts(accountList);
				break;
			case 6:
                transactionRepository.displayAllTransactions(transactionList);
				break;
			case 7:
				System.out.println("enter account ID:");
				String accountid=sc.nextLine();
				transactionRepository.displayTransactionById(transactionList, accountid);
				break;
			case 8:
				transactionService.displayHighValueTransactions(transactionList);
				break;
			case 9:
				transactionService.displayFailedTransactions(transactionList);
				break;
			case 10:
				accountService.displaySavingsAccounts(accountList);
                break;
			case 11:
				accountService.displayActiveAccounts(accountList);
				break;
			}
		}
	}
}
