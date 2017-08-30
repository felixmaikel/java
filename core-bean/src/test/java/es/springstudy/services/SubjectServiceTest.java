package es.springstudy.services;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import es.springstudy.models.tools.ContextUtils;
import es.springstudy.services.SubjectService;

public class SubjectServiceTest {

	private static final String SUBJECT_SERVICE = "subjectService";
	private static final String SUBJECT_SERVICE_1 = "subjectService1";
	private ApplicationContext applicationContext;
	
	@Before
	public void loadContext() {
		applicationContext = new ClassPathXmlApplicationContext(ContextUtils.APPLICATION_CONTEXT_XML);
	}
	
	@Test
	public void createSubjectServiceValue() {
		final int expectedValue = 6;
		
		final SubjectService subjectService = (SubjectService)applicationContext.getBean(SUBJECT_SERVICE);
		
		Assert.assertEquals(expectedValue, subjectService.getInitialIdentifier());
	}
	
	@Test
	public void createSubjectServiceFactoryService() {
		final int expectedValue = 7;
		
		final SubjectService subjectService = (SubjectService)applicationContext.getBean(SUBJECT_SERVICE_1);
		
		Assert.assertEquals(expectedValue, subjectService.getInitialIdentifier());
	}
}
