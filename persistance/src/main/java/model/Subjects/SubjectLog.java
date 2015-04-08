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

public class SubjectLog implements Serializable{
	
	
	private Subject subjectId;
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int log;
	@Column
	private String subjectLog;
	
	public Subject getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Subject subjectId) {
		this.subjectId = subjectId;
	}
	public int getLog() {
		return log;
	}
	public void setLog(int log) {
		this.log = log;
	}
	public String getSubjectLog() {
		return subjectLog;
	}
	public void setSubjectLog(String subjectLog) {
		this.subjectLog = subjectLog;
	}
	
	
}
