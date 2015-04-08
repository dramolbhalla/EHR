package model.Subjects;

import static javax.persistence.GenerationType.IDENTITY;

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

public class SubjectExpired {

	
	private Subject subjectId;
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int expired;
	@Column
	private boolean subjectExpired;
	@Column
	private int subjectExpiredAge;
	@Column
	private int subjectExpiredDate;
	@Column
	private int subjectExpiredMonth;
	@Column
	private int subjectExpiredYear;
	@Column
	private String subjectExpiredReason;
	
	/*
	 * ++------------++Getters and Setters++------------++
	 */
	public Subject getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Subject subjectId) {
		this.subjectId = subjectId;
	}
	public int getExpired() {
		return expired;
	}
	public void setExpired(int expired) {
		this.expired = expired;
	}
	public boolean isSubjectExpired() {
		return subjectExpired;
	}
	public void setSubjectExpired(boolean subjectExpired) {
		this.subjectExpired = subjectExpired;
	}
	public int getSubjectExpiredAge() {
		return subjectExpiredAge;
	}
	public void setSubjectExpiredAge(int subjectExpiredAge) {
		this.subjectExpiredAge = subjectExpiredAge;
	}
	public int getSubjectExpiredDate() {
		return subjectExpiredDate;
	}
	public void setSubjectExpiredDate(int subjectExpiredDate) {
		this.subjectExpiredDate = subjectExpiredDate;
	}
	public int getSubjectExpiredMonth() {
		return subjectExpiredMonth;
	}
	public void setSubjectExpiredMonth(int subjectExpiredMonth) {
		this.subjectExpiredMonth = subjectExpiredMonth;
	}
	public int getSubjectExpiredYear() {
		return subjectExpiredYear;
	}
	public void setSubjectExpiredYear(int subjectExpiredYear) {
		this.subjectExpiredYear = subjectExpiredYear;
	}
	public String getSubjectExpiredReason() {
		return subjectExpiredReason;
	}
	public void setSubjectExpiredReason(String subjectExpiredReason) {
		this.subjectExpiredReason = subjectExpiredReason;
	} 
}
