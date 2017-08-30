package es.springstudy.models;

public class Teacher extends Person {

	private Subject subject;
	
	public Teacher() {
		
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
}
