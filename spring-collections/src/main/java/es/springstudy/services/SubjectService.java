package es.springstudy.services;

import java.util.List;
import java.util.Map;
import java.util.Set;

import es.springstudy.models.Subject;

public class SubjectService {

	private List<String> names;
	private List<Subject> subjects;
	private Set<Subject> setSubjects;
	private Map<String, Subject> mapSubject;
	
	public SubjectService() {
		
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public Set<Subject> getSetSubjects() {
		return setSubjects;
	}

	public void setSetSubjects(Set<Subject> setSubjects) {
		this.setSubjects = setSubjects;
	}

	public Map<String, Subject> getMapSubject() {
		return mapSubject;
	}

	public void setMapSubject(Map<String, Subject> mapSubject) {
		this.mapSubject = mapSubject;
	}

}
