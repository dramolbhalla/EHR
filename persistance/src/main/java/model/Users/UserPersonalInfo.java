/**
 * @author Amol Bhalla
 *
 */
package model.Users;

import javax.persistence.Entity;
import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.*;
import javax.persistence.OneToOne;

public class UserPersonalInfo implements Serializable{
	
	
	private User user;
	private int personalInfo;
	private String title;
	private String firstName;
	private String middleName;
	private String lastName;
	private String initials;
	private String department; 
	private String profTitle;
	private String designations;
	private String address1; 
	private String address2; 
	private String city; 
	private String state; 
	private String zip;  
	private String homePhone; 
	private String mobilePhone; 
	private String ssn;  
	private String birthdate;
	private String email;
	
	/*
	 * ++------------++Getters and Setters++------------++
	 */
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getPersonalInfo() {
		return personalInfo;
	}
	public void setPersonalInfo(int personalInfo) {
		this.personalInfo = personalInfo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getInitials() {
		return initials;
	}
	public void setInitials(String initials) {
		this.initials = initials;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getProfTitle() {
		return profTitle;
	}
	public void setProfTitle(String profTitle) {
		this.profTitle = profTitle;
	}
	public String getDesignations() {
		return designations;
	}
	public void setDesignations(String designations) {
		this.designations = designations;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getHomePhone() {
		return homePhone;
	}
	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	} 
	
	
}
