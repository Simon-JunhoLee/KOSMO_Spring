package com.example.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class TradeVO extends AccountVO {
	private int tid;
	private String ano;
	private String tno;
	private double amount;
	@JsonFormat(pattern="yyyy년 MM월 dd일 HH시 mm분 ss초", timezone="Asia/Seoul")
	private Date tradeDate;
	private int type;

	public TradeVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TradeVO(String ano, String uid, Date openDate, double balance) {
		super(ano, uid, openDate, balance);
		// TODO Auto-generated constructor stub
	}

	public TradeVO(String uid, String upass, String uname, String phone, String address1, String address2, String photo,
			Date regDate) {
		super(uid, upass, uname, phone, address1, address2, photo, regDate);
		// TODO Auto-generated constructor stub
	}

	public TradeVO(int tid, String ano, String tno, double amount, Date tradeDate, int type) {
		super();
		this.tid = tid;
		this.ano = ano;
		this.tno = tno;
		this.amount = amount;
		this.tradeDate = tradeDate;
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "TradeVO [tid=" + tid + ", ano=" + ano + ", tno=" + tno + ", amount=" + amount + ", tradeDate="
				+ tradeDate + ", type=" + type + ", getUname()=" + getUname() + "]";
	}

	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getTno() {
		return tno;
	}
	public void setTno(String tno) {
		this.tno = tno;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getTradeDate() {
		return tradeDate;
	}
	public void setTradeDate(Date tradeDate) {
		this.tradeDate = tradeDate;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
}
