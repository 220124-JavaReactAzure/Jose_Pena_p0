package com.revature.bankingApplication.models;




public class Account { 

	private String accountId;
	private String accountName;
	private String accountType; // Maybe make cheking or savings but maybe that's too complicated
	private double balance; // Will this scream at me for using primitives' ?

	
	//Constructors
	public Account() {
		super();
	}

	public Account(String accountId, String accountName, String accountType, double balance, Account creator) {
		super();
		this.accountId = accountId;
		this.accountName = accountName;
		this.accountType = accountType;
		this.balance = balance;
	}

	
	
	//Pretty sure some of these setters or getters should not exist for the account?
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}