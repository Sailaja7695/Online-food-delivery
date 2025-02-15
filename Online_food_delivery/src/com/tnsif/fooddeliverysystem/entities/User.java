package com.tnsif.fooddeliverysystem.entities;

public class User {

	private int userid;
	private String username;
	private long contactNo;
	public User(int userid, String username, long contactNo) {
		this.userid = userid;
		this.username = username;
		this.contactNo = contactNo;
	}
	public int getUserid() {
		return userid;
	}
	
	public String getUsername() {
		return username;
	}
	
	public long getContactNo() {
		return contactNo;
	}
	
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", contactNo=" + contactNo + "]";
	}
	
	

}
