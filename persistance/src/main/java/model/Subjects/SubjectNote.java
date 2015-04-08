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

public class SubjectNote implements Serializable{
	
	
	private Subject subjectId;
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int note;
	@Column
	private String subjectNote;
	
	/*
	 * ++------------++Getters and Setters++------------++
	 */
	public Subject getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Subject subjectId) {
		this.subjectId = subjectId;
	}
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
	}
	public String getSubjectNote() {
		return subjectNote;
	}
	public void setSubjectNote(String subjectNote) {
		this.subjectNote = subjectNote;
	}
	
	
}
