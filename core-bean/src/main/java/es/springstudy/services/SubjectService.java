package es.springstudy.services;

public class SubjectService {

	private int initialIdentifier;
	
	private SubjectService(final int initialIdentifier) {
		this.initialIdentifier = initialIdentifier;
	}
	
	public static SubjectService createSubjectServiceInstance(final int initialIdentifier) {
		
		return new SubjectService(initialIdentifier);
	}

	public int getInitialIdentifier() {
		return initialIdentifier;
	}
	
}
