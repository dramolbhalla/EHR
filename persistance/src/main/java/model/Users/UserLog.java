package model.Users;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.*;
import javax.persistence.OneToOne;

public class UserLog implements Serializable{
	
	private User user;
	private int log;
	private String userLog;
	
	/*
	 * ++------------++Getters and Setters++------------++
	 */
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getLog() {
		return log;
	}
	public void setLog(int log) {
		this.log = log;
	}
	public String getUserLog() {
		return userLog;
	}
	public void setUserLog(String userLog) {
		this.userLog = userLog;
	}
	
	
}
