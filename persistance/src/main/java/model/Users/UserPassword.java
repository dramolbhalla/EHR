/**
 * @author Amol Bhalla
 *
 */
package model.Users;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.*;
import javax.persistence.OneToOne;

public class UserPassword implements Serializable{
	
	private User user;
	private int password;
	private String passwordString;
	
	/*
	 * ++------------++Getters and Setters++------------++
	 */
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public String getPasswordString() {
		return passwordString;
	}
	public void setPasswordString(String passwordString) {
		this.passwordString = passwordString;
	}
}
