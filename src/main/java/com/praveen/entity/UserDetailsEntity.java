package com.praveen.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
@Table(name = "USER_DETAILS_TABLE")
public class UserDetailsEntity {
	
	@Id
	@Column(name="USER_ID")
	@GeneratedValue
	private Integer userId;
	@Column(name="USER_FNAME")
	private String userFName;
	@Column(name="USER_LNAME")
	private String userLName;
	@Column(name="USER_EMAIL")
	private String userEmail;
	@Column(name="USER_DOB")
	private Date userDob;
	@Column(name="USER_PHN")
	private Long userPhoneNo;
	@Column(name="USER_GENDER")
	private String userGender;
	@Column(name="USER_PWD")
	private String userPWD;
	@Column(name="USER_ROLE")
	private String userRole;
	@Column(name="LOCK_STATUS")
	private String 	lockStatus;
	@CreationTimestamp
	private Date createdDate;
	@UpdateTimestamp
	private Date updatedDate;
	
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
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
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public String getUserPWD() {
		return userPWD;
	}
	public String getUserRole() {
		return userRole;
	}
	public String getLockStatus() {
		return lockStatus;
	}
	public void setLockStatus(String lock) {
		// TODO Auto-generated method stub
		
	}
	public void setUserRole(String role) {
		// TODO Auto-generated method stub
		
	}
	public void setUserPWD(String randomAlphabetic) {
		// TODO Auto-generated method stub
		
	}

}
