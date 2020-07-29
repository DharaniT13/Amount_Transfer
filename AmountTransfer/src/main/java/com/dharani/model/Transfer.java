package com.dharani.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transfer 
{
	@Id
	private int transferid;
	private int transferamount;
	private int balance;
	public int getTransferid() {
		return transferid;
	}
	public void setTransferid(int transferid) {
		this.transferid = transferid;
	}
	public int getTransferamount() {
		return transferamount;
	}
	public void setTransferamount(int transferamount) {
		this.transferamount = transferamount;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
