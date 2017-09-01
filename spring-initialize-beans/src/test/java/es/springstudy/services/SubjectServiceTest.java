package es.springstudy.services;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import es.springstudy.tools.ContextUtils;

public class SubjectServiceTest {

	private static final String SUBJECT_SERVICE = "subjectService";
	private static final String PERSON_SERVICE = "personService";
	private ApplicationContext applicationContext;
	
	@Before
	public void loadContext() {
		applicationContext = new ClassPathXmlApplicationContext(ContextUtils.APPLICATION_CONTEXT_XML);
	}
	
	
	@Test
	public void createSubjectService() {
		
		final SubjectService subjectService = (SubjectService)applicationContext.getBean(SUBJECT_SERVICE);
		
		Assert.assertNotNull(subjectService);
	}
	
	@Test
	public void createPersonService() {
		
		final PersonService personService = (PersonService)applicationContext.getBean(PERSON_SERVICE);
		
		Assert.assertNotNull(personService);
	}
}
