package com.example.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ReplyVO extends BBSVO{
	private int rid;
	private int bid;
	private String uid;
	@JsonFormat(pattern="yyyy년 MM월 dd일 HH시 mm분 ss초", timezone="Asia/Seoul")
	private Date regDate;
	private String contents;
	@JsonFormat(pattern="yyyy년 MM월 dd일 HH시 mm분 ss초", timezone="Asia/Seoul")
	private Date updateDate;
	private int rating;
	
	public ReplyVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReplyVO(int bid, String title, String contents, Date regDate, String uid, int viewCnt) {
		super(bid, title, contents, regDate, uid, viewCnt);
		// TODO Auto-generated constructor stub
	}

	public ReplyVO(String uid, String upass, String uname, String phone, String address1, String address2, String photo,
			Date regDate) {
		super(uid, upass, uname, phone, address1, address2, photo, regDate);
		// TODO Auto-generated constructor stub
	}

	public ReplyVO(int rid, int bid, String uid, Date regDate, String contents, Date updateDate, int rating) {
		super();
		this.rid = rid;
		this.bid = bid;
		this.uid = uid;
		this.regDate = regDate;
		this.contents = contents;
		this.updateDate = updateDate;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "ReplyVO [rid=" + rid + ", bid=" + bid + ", uid=" + uid + ", regDate=" + regDate + ", contents="
				+ contents + ", updateDate=" + updateDate + ", rating=" + rating + ", getUname()=" + getUname() + "]";
	}

	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
}
