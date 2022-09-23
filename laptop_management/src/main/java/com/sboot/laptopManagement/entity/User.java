package com.sboot.laptopManagement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private int uid;
	private String uname;
	private String mobileno;
	private String password;
	public User() {
		super();
		// TODO Auto-generated constructor stub
		
	}
	public User(int uid, String uname, String mobileno, String password) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.mobileno = mobileno;
		this.password = password;
		
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
		
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", mobileno=" + mobileno + ", password=" + password + "]";
	}
}
	