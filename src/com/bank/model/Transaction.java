package com.bank.model;

import com.bank.enums.Channel;

public class Transaction {

	private String tnxId;
	private Account fromAcc;
	private Account toAcc;
	private Double tnxAmount;
	private Channel channel;
	private String tnxStatus;

	public Transaction(String tnxId, Account fromAcc, Account toAcc, Double tnxAmount, Channel channel,
			String tnxStatus) {

		this.tnxId = tnxId;
		this.fromAcc = fromAcc;
		this.toAcc = toAcc;
		this.tnxAmount = tnxAmount;
		this.channel = channel;
		this.tnxStatus = tnxStatus;
	}

	public String getTnxId() {
		return tnxId;
	}

	public Account getFromAcc() {
		return fromAcc;
	}

	public Account getToAcc() {
		return toAcc;
	}

	public Double getTnxAmount() {
		return tnxAmount;
	}

	public Channel getChannel() {
		return channel;
	}

	public String getTnxStatus() {
		return tnxStatus;
	}

}
