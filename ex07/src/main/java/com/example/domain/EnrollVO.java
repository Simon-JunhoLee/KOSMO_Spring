package com.example.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class EnrollVO extends CouVO {
	private String scode;
	private String lcode;
	@JsonFormat(pattern="yyyy-MM-dd", timezone="Asia/Seoul")
	private Date edate;
	private int grade;
	
	public EnrollVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public EnrollVO(String lcode, String lname, int hours, String room, String instructor, int capacity, int persons) {
		super(lcode, lname, hours, room, instructor, capacity, persons);
		// TODO Auto-generated constructor stub
	}
	
	public EnrollVO(String pcode, String pname, String dept, Date hiredate, String title, int salary) {
		super(pcode, pname, dept, hiredate, title, salary);
		// TODO Auto-generated constructor stub
	}
	
	public EnrollVO(String scode, String lcode, Date edate, int grade) {
		super();
		this.scode = scode;
		this.lcode = lcode;
		this.edate = edate;
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "EnrollVO [scode=" + scode + ", lcode=" + lcode + ", edate=" + edate + ", grade=" + grade + "]";
	}
	public String getScode() {
		return scode;
	}
	public void setScode(String scode) {
		this.scode = scode;
	}
	public String getLcode() {
		return lcode;
	}
	public void setLcode(String lcode) {
		this.lcode = lcode;
	}
	public Date getEdate() {
		return edate;
	}
	public void setEdate(Date edate) {
		this.edate = edate;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
}
