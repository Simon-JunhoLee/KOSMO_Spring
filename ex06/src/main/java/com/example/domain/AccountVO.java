package com.example.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class AccountVO extends UsersVO{
	private String ano;
	private String uid;
	@JsonFormat(pattern="yyyy년 MM월 dd일 HH시 mm분 ss초", timezone="Asia/Seoul")
	private Date openDate;
	private double balance;
	private String fmtBalance;
	
	public AccountVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public AccountVO(String uid, String upass, String uname, String phone, String address1, String address2,
			String photo, Date regDate) {
		super(uid, upass, uname, phone, address1, address2, photo, regDate);
		// TODO Auto-generated constructor stub
	}
	
	public AccountVO(String ano, String uid, Date openDate, double balance) {
		super();
		this.ano = ano;
		this.uid = uid;
		this.openDate = openDate;
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "AccountVO [ano=" + ano + ", uid=" + uid + ", openDate=" + openDate + ", balance=" + balance
				+ ", getUname()=" + getUname() + "]";
	}

	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public Date getOpenDate() {
		return openDate;
	}
	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getFmtBalance() {
		return fmtBalance;
	}
	public void setFmtBalance(String fmtBalance) {
		this.fmtBalance = fmtBalance;
	}
}
