package com.softcits.wu.entity;

public class User {
	private String userId;
	 private String username;
	 private String userPassword;
	 private String userAddress;
	 private String userPhone;
	 // 角色  1表示管理员   0表示普通用户
	 private int role;
	 public String getUserId() {
	  return userId;
	 }
	 public void setUserId(String userId) {
	  this.userId = userId;
	 }
	 //返回值？sting 参数列表空 
	 public String getUsername() {
	  return username;
	 }
	 public void setUsername(String username) {
	  this.username = username;
	 }
	 public String getUserPassword() {
	  return userPassword;
	 }
	 public void setUserPassword(String userPassword) {
	  this.userPassword = userPassword;
	 }
	 public String getUserAddress() {
	  return userAddress;
	 }
	 public void setUserAddress(String userAddress) {
	  this.userAddress = userAddress;
	 }
	 public String getUserPhone() {
	  return userPhone;
	 }
	 public void setUserPhone(String userPhone) {
	  this.userPhone = userPhone;
	 }
	 public int getRole() {
	  return role;
	 }
	 public void setRole(int role) {
	  this.role = role;
	 }
	 public User(String userId, String username, String userPassword, String userAddress, String userPhone, int role) {
	  super();
	  this.userId = userId;
	  this.username = username;
	  this.userPassword = userPassword;
	  this.userAddress = userAddress;
	  this.userPhone = userPhone;
	  this.role = role;
	 }
	 public User() {
	  super();
	 }
	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", userPassword=" + userPassword + ", userAddress="
				+ userAddress + ", userPhone=" + userPhone + ", role=" + role + "]";
	}
	 
	 
}
