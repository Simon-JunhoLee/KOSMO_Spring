package com.example.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class StuVO extends ProVO {
	private String scode;
	private String sname;
	private String dept;
	private int year;
	@JsonFormat(pattern="yyyy-MM-dd", timezone="Asia/Seoul")
	private Date birthday;
	private String advisor;
	private String photo;
	
	public StuVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public StuVO(String pcode, String pname, String dept, Date hiredate, String title, int salary) {
		super(pcode, pname, dept, hiredate, title, salary);
		// TODO Auto-generated constructor stub
	}
	
	public StuVO(String scode, String sname, String dept, int year, Date birthday, String advisor, String photo) {
		super();
		this.scode = scode;
		this.sname = sname;
		this.dept = dept;
		this.year = year;
		this.birthday = birthday;
		this.advisor = advisor;
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "StuVO [scode=" + scode + ", sname=" + sname + ", dept=" + dept + ", year=" + year + ", birthday="
				+ birthday + ", advisor=" + advisor + ", getPname()=" + getPname() + "]";
	}
	
	public String getScode() {
		return scode;
	}
	public void setScode(String scode) {
		this.scode = scode;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getAdvisor() {
		return advisor;
	}
	public void setAdvisor(String advisor) {
		this.advisor = advisor;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
}
