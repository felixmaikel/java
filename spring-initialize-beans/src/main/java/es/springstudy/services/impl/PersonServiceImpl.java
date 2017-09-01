package es.springstudy.services.impl;

import es.springstudy.dao.PersonDao;
import es.springstudy.services.PersonService;

public class PersonServiceImpl implements PersonService{

	private PersonDao personDao;
	
	public PersonServiceImpl(final PersonDao personDao) {
		this.personDao = personDao;
	}

	public PersonDao getPersonDao() {
		return personDao;
	}
	
}
