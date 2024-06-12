package com.example.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class BBSVO extends UsersVO{
	private int bid;
	private String title;
	private String Contents;
	@JsonFormat(pattern="yyyy년 MM월 dd일 HH시 mm분 ss초", timezone="Asia/Seoul")
	private Date regDate;
	private String uid;
	private int viewCnt;

	public BBSVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BBSVO(String uid, String upass, String uname, String phone, String address1, String address2, String photo,
			Date regDate) {
		super(uid, upass, uname, phone, address1, address2, photo, regDate);
		// TODO Auto-generated constructor stub
	}
	
	public BBSVO(int bid, String title, String contents, Date regDate, String uid, int viewCnt) {
		super();
		this.bid = bid;
		this.title = title;
		Contents = contents;
		this.regDate = regDate;
		this.uid = uid;
		this.viewCnt = viewCnt;
	}
	
	@Override
	public String toString() {
		return "BBSVO [bid=" + bid + ", title=" + title + ", Contents=" + Contents + ", regDate=" + regDate + ", uid="
				+ uid + ", viewCnt=" + viewCnt + ", getUname()=" + getUname() + "]";
	}
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return Contents;
	}
	public void setContents(String contents) {
		Contents = contents;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public int getViewCnt() {
		return viewCnt;
	}
	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}
}
