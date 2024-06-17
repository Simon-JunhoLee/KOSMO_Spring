package com.example.domain;


import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class UsersVO {
	private String uid;
	private String upass;
	private String uname;
	private String phone;
	private String address1;
	private String address2;
	private String photo;
	@JsonFormat(pattern="yyyy년 MM월 dd일 HH시 mm분 ss초", timezone="Asia/Seoul")
	private Date regDate;
	
	public UsersVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsersVO(String uid, String upass, String uname, String phone, String address1, String address2, String photo,
			Date regDate) {
		super();
		this.uid = uid;
		this.upass = upass;
		this.uname = uname;
		this.phone = phone;
		this.address1 = address1;
		this.address2 = address2;
		this.photo = photo;
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "UsersVO [uid=" + uid + ", upass=" + upass + ", uname=" + uname + ", phone=" + phone + ", address1="
				+ address1 + ", address2=" + address2 + ", photo=" + photo + ", regDate=" + regDate + "]";
	}

	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
}