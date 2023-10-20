package com.pom;

public class UserDataPojo {
	
 // Pojo is a class where we store all the user related data , getters and setters
	
	private int userId;
	private String name;
	private String add;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	 
	// So this class contains private data members and getters and setters only. So such classes called as Pojo classes
	// This class belongs to user so the variables which are there are belongs to user only and user related methods are there
	// This classes mainly used in API's
	
}
