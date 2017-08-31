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
	private ApplicationContext applicationContext;
	
	@Before
	public void loadContext() {
		applicationContext = new ClassPathXmlApplicationContext(ContextUtils.APPLICATION_CONTEXT_XML);
	}
	
	@Test
	public void createListCollectionReferences() {
		final int expectedSize = 4;
		
		final SubjectService subjectService = (SubjectService)applicationContext.getBean(SUBJECT_SERVICE);
		
		Assert.assertNotNull(subjectService.getSubjects());
		Assert.assertEquals(expectedSize, subjectService.getSubjects().size());
		
	}
	
	@Test
	public void createListCollectionValues() {
		final int expectedSize = 4;
		final String math = "Math";
		final String history = "History";
		final String phisical = "Phisical";
		final String quimical = "Quimical";
		
		final SubjectService subjectService = (SubjectService)applicationContext.getBean(SUBJECT_SERVICE);
		
		Assert.assertNotNull(subjectService.getSubjects());
		Assert.assertEquals(expectedSize, subjectService.getNames().size());
		Assert.assertEquals(math, subjectService.getNames().get(0));
		Assert.assertEquals(history, subjectService.getNames().get(1));
		Assert.assertEquals(phisical, subjectService.getNames().get(2));
		Assert.assertEquals(quimical, subjectService.getNames().get(3));
		
	}
	
	@Test
	public void createSetCollection() {
		final int expectedSize = 4;
		
		final SubjectService subjectService = (SubjectService)applicationContext.getBean(SUBJECT_SERVICE);
		
		Assert.assertNotNull(subjectService.getSetSubjects());
		Assert.assertEquals(expectedSize, subjectService.getSetSubjects().size());
		
	}
	
	@Test
	public void createMapCollection() {
		final int expectedSize = 4;
		final String mathKey = "math";
		final String historyKey = "history";
		final String phisicalKey = "phisical";
		final String quimicalKey = "quimical";
		final String math = "Mathematic";
		final String history = "History";
		final String phisical = "Phisical";
		final String quimical = "Quimical";
		
		final SubjectService subjectService = (SubjectService)applicationContext.getBean(SUBJECT_SERVICE);
		
		Assert.assertNotNull(subjectService.getMapSubject());
		Assert.assertEquals(expectedSize, subjectService.getMapSubject().size());
		Assert.assertEquals(math, subjectService.getMapSubject().get(mathKey).getSubjectName());
		Assert.assertEquals(history, subjectService.getMapSubject().get(historyKey).getSubjectName());
		Assert.assertEquals(phisical, subjectService.getMapSubject().get(phisicalKey).getSubjectName());
		Assert.assertEquals(quimical, subjectService.getMapSubject().get(quimicalKey).getSubjectName());
		
	}
	
}
