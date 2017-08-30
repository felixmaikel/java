package es.springstudy.models;

public class Laboratory {

	private int laboratoryNumber;
	private Subject subject;
	
	public Laboratory(final int laboratoryNumber, final Subject subject) {
		this.laboratoryNumber = laboratoryNumber;
		this.subject = subject;
	}

	public int getLaboratoryNumber() {
		return laboratoryNumber;
	}

	public Subject getSubject() {
		return subject;
	}
	
}
