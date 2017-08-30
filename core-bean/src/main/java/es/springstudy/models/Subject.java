package es.springstudy.models;

public class Subject {

	private int subjectId;
	private String subjectName;
	private String description;
	
	public Subject(final int subjectId, final String subjectName, final String description) {
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.description = description;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public String getDescription() {
		return description;
	}
	
}
