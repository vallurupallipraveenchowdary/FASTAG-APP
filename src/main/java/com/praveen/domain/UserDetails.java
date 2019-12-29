package com.praveen.domain;

import java.util.Date;

import lombok.Data;

@Data


public class UserDetails {
	
	private String userFName;
	private String userLName;
	private String userEmail;
	private Date userDob;
	private Long userPhoneNo;
	private String userGender;
	public String getUserFName() {
		return userFName;
	}
	public void setUserFName(String userFName) {
		this.userFName = userFName;
	}
	public String getUserLName() {
		return userLName;
	}
	public void setUserLName(String userLName) {
		this.userLName = userLName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public Date getUserDob() {
		return userDob;
	}
	public void setUserDob(Date userDob) {
		this.userDob = userDob;
	}
	public Long getUserPhoneNo() {
		return userPhoneNo;
	}
	public void setUserPhoneNo(Long userPhoneNo) {
		this.userPhoneNo = userPhoneNo;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	
	
}
