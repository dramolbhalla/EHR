/**
 * @author Amol Bhalla
 *
 */
package model.Subjects;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;


public class Subject implements Serializable{
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sid;
	@Column
	private String subjectId;
	@Column
	private Set<SubjectLog> subjectLogs;
	@Column
	private Set<SubjectNote> subjectNotes;
	@Column
	private SubjectPersonalInfo subjectPersonalInfo;
	
	/*
	 * ++------------++Getters and Setters++------------++
	 */
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}
	public Set<SubjectLog> getSubjectLogs() {
		return subjectLogs;
	}
	public void setSubjectLogs(Set<SubjectLog> subjectLogs) {
		this.subjectLogs = subjectLogs;
	}
	public Set<SubjectNote> getSubjectNotes() {
		return subjectNotes;
	}
	public void setSubjectNotes(Set<SubjectNote> subjectNotes) {
		this.subjectNotes = subjectNotes;
	}
	public SubjectPersonalInfo getSubjectPersonalInfo() {
		return subjectPersonalInfo;
	}
	public void setSubjectPersonalInfo(SubjectPersonalInfo subjectPersonalInfo) {
		this.subjectPersonalInfo = subjectPersonalInfo;
	}

	
}
