/**
 * @author Amol Bhalla
 *
 */
package model.Subjects;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

public class SubjectPersonalInfo implements Serializable{
	
	
	private Subject subjectId;
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int personalInfo;
	@Column
	private String title;
	@Column
	private String firstName;
	@Column
	private String middleName;
	@Column
	private String lastName;
	@Column
	private String profTitle;
	@Column
	private String address1;
	@Column
	private String address2;
	@Column
	private String city; 
	@Column
	private String state; 
	@Column
	private String zip; 
	@Column
	private String homePhone;
	@Column
	private String mobilePhone; 
	@Column
	private String ssn;  
	@Column
	private String birthdate;
	@Column
	private String email; 
	@Column
	private Set<SubjectEmergencyContact> subjectEmergencyContact;
	@Column
	private SubjectExpired subjectExpired;
	@Column
	private Set<SubjectWorkInfo> subjectWorkInfo;
	
	/*
	 * ++------------++Getters and Setters++------------++
	 */
	public Subject getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Subject subjectId) {
		this.subjectId = subjectId;
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
	public String getProfTitle() {
		return profTitle;
	}
	public void setProfTitle(String profTitle) {
		this.profTitle = profTitle;
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
	public Set<SubjectEmergencyContact> getSubjectEmergencyContact() {
		return subjectEmergencyContact;
	}
	public void setSubjectEmergencyContact(
			Set<SubjectEmergencyContact> subjectEmergencyContact) {
		this.subjectEmergencyContact = subjectEmergencyContact;
	}
	public SubjectExpired getSubjectExpired() {
		return subjectExpired;
	}
	public void setSubjectExpired(SubjectExpired subjectExpired) {
		this.subjectExpired = subjectExpired;
	}
	public Set<SubjectWorkInfo> getSubjectWorkInfo() {
		return subjectWorkInfo;
	}
	public void setSubjectWorkInfo(Set<SubjectWorkInfo> subjectWorkInfo) {
		this.subjectWorkInfo = subjectWorkInfo;
	}

	
}
