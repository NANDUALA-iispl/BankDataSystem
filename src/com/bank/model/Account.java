package com.bank.model;

import java.util.List;

public class Account {

	private String accNo;
	private String accHolderName;
	private String accId;
	private String accType;
	private Double accBalance;
	private String accStatus;
	private List<Transaction> transactionList;

	public Account(String accNo, String accHolderName, String accId, String accType, Double accBalance,
			String accStatus, List<Transaction> transactionList) {

		this.accNo = accNo;
		this.accHolderName = accHolderName;
		this.accId = accId;
		this.accType = accType;
		this.accBalance = accBalance;
		this.accStatus = accStatus;
		this.transactionList = transactionList;
	}

	public String getAccNo() {
		return accNo;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public String getAccId() {
		return accId;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public Double getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(Double accBalance) {
		this.accBalance = accBalance;
	}

	public String getAccStatus() {
		return accStatus;
	}

	public void setAccStatus(String accStatus) {
		this.accStatus = accStatus;
	}

	public List<Transaction> getTransactionList() {
		return transactionList;
	}

	public void setTransactionList(List<Transaction> transactionList) {
		this.transactionList = transactionList;
	}

}
