/**
 * @author Amol Bhalla
 *
 */
package model.Users;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import model.Subjects.*;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Entity;
import javax.persistence.Inheritance;

public class User implements Serializable {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int uid;
	@Column
	private String userId;
	@Column
	private int accessLevel;
	@Column
	private Set<Subject> subjects = new HashSet<Subject>(0);
	@Column
	private Set<UserNote> userNotes = new HashSet<UserNote>(0);
	@Column
	private Set<UserLog> userLogs = new HashSet<UserLog>(0);
	@Column
	private UserPassword userPassword;
	
	/*
	 * ++------------++Getters and Setters++------------++
	 */
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getAccessLevel() {
		return accessLevel;
	}
	public void setAccessLevel(int accessLevel) {
		this.accessLevel = accessLevel;
	}
	public Set<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(Set<Subject> subjects) {
		this.subjects = subjects;
	}
	public Set<UserNote> getUserNotes() {
		return userNotes;
	}
	public void setUserNotes(Set<UserNote> userNotes) {
		this.userNotes = userNotes;
	}
	public Set<UserLog> getUserLogs() {
		return userLogs;
	}
	public void setUserLogs(Set<UserLog> userLogs) {
		this.userLogs = userLogs;
	}
	public UserPassword getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(UserPassword userPassword) {
		this.userPassword = userPassword;
	}
	
	
}
