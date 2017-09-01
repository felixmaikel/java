package es.springstudy.services.impl;

import es.springstudy.dao.SubjectDao;
import es.springstudy.services.SubjectService;

public class SubjectServiceImpl implements SubjectService {

	private SubjectDao subjectDao;
	
	public SubjectServiceImpl(final SubjectDao subjectDao) {
		this.subjectDao = subjectDao;
	}

	public SubjectDao getSubjectDao() {
		return subjectDao;
	}
}
