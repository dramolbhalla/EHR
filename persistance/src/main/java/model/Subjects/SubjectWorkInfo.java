/**
 * @author Amol Bhalla
 *
 */
package model.Subjects;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

public class SubjectWorkInfo implements Serializable{
	
	
	private Subject subjectId;
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int workInfo;
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
	private String workPhone;
	@Column
	private String extension;
	@Column
	private String fax; 
	@Column
	private String email;
	
	/*
	 * ++------------++Getters and Setters++------------++
	 */
	public Subject getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Subject subjectId) {
		this.subjectId = subjectId;
	}
	public int getWorkInfo() {
		return workInfo;
	}
	public void setWorkInfo(int workInfo) {
		this.workInfo = workInfo;
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
	public String getWorkPhone() {
		return workPhone;
	}
	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	} 

	
}
