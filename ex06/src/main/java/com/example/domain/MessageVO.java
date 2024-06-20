package com.example.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class MessageVO extends UsersVO{
	private int mid;
	private String sender;
	private String receiver;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="Asia/Seoul")
	private Date sendDate;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="Asia/Seoul")
	private Date readDate;
	private String message;
	private int sendDelete;
	private int receiveDelete;
	private String senderName;
	private String receiverName;

	public MessageVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MessageVO(String uid, String upass, String uname, String phone, String address1, String address2,
			String photo, Date regDate) {
		super(uid, upass, uname, phone, address1, address2, photo, regDate);
		// TODO Auto-generated constructor stub
	}

	public MessageVO(int mid, String sender, String receiver, Date sendDate, Date readDate, String message,
			int sendDelete, int receiveDelete, String senderName, String receiverName) {
		super();
		this.mid = mid;
		this.sender = sender;
		this.receiver = receiver;
		this.sendDate = sendDate;
		this.readDate = readDate;
		this.message = message;
		this.sendDelete = sendDelete;
		this.receiveDelete = receiveDelete;
		this.senderName = senderName;
		this.receiverName = receiverName;
	}

	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public Date getSendDate() {
		return sendDate;
	}
	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}
	public Date getReadDate() {
		return readDate;
	}
	public void setReadDate(Date readDate) {
		this.readDate = readDate;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public int getSendDelete() {
		return sendDelete;
	}
	public void setSendDelete(int sendDelete) {
		this.sendDelete = sendDelete;
	}
	public int getReceiveDelete() {
		return receiveDelete;
	}
	public void setReceiveDelete(int receiveDelete) {
		this.receiveDelete = receiveDelete;
	}
	public String getSenderName() {
		return senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	public String getReceiverName() {
		return receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
}
