package es.springstudy.models;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import es.springstudy.models.tools.ContextUtils;

public class SubjectTest {

	private static final String SUBJECT_MATH = "subjectMath";
	private static final String SUBJECT_HISTORY = "subjectHistory";
	private static final String SUBJECT_PHISICAL = "subjectPhisical";
	private static final String SUBJECT_QUIMICAL = "subjectQuimical";
	private static final String LABORATORY_PHISICAL = "laboratoryPhisical";
	private ApplicationContext applicationContext;
	
	@Before
	public void loadSpringContext() {
		applicationContext = new ClassPathXmlApplicationContext(ContextUtils.APPLICATION_CONTEXT_XML);
	}
	
	@Test
	public void createSubjectUsedConstructorValues() {
		final int subjectIdExpected = 1;
		final String subjectNameExpected = "Mathematic";
		final String descriptionExpected = "Subject mathematic";
		
		final Subject subject = (Subject)applicationContext.getBean(SUBJECT_MATH);
		
		Assert.assertEquals(subjectIdExpected, subject.getSubjectId());
		Assert.assertEquals(subjectNameExpected, subject.getSubjectName());
		Assert.assertEquals(descriptionExpected, subject.getDescription());
	}
	
	@Test
	public void createSubjectUsedConstructorTypeAndValues() {
		final int subjectIdExpected = 2;
		final String subjectNameExpected = "History";
		final String descriptionExpected = "Subject History";
		
		final Subject subject = (Subject)applicationContext.getBean(SUBJECT_HISTORY);
		
		Assert.assertEquals(subjectIdExpected, subject.getSubjectId());
		Assert.assertEquals(subjectNameExpected, subject.getSubjectName());
		Assert.assertEquals(descriptionExpected, subject.getDescription());
	}
	
	@Test
	public void createSubjectUsedConstructorIndex() {
		final int subjectIdExpected = 3;
		final String subjectNameExpected = "Phisical";
		final String descriptionExpected = "Subject Phisical";
		
		final Subject subject = (Subject)applicationContext.getBean(SUBJECT_PHISICAL);
		
		Assert.assertEquals(subjectIdExpected, subject.getSubjectId());
		Assert.assertEquals(subjectNameExpected, subject.getSubjectName());
		Assert.assertEquals(descriptionExpected, subject.getDescription());
	}
	
	@Test
	public void createSubjectUsedConstructorName() {
		final int subjectIdExpected = 4;
		final String subjectNameExpected = "Quimical";
		final String descriptionExpected = "Subject Quimical";
		
		final Subject subject = (Subject)applicationContext.getBean(SUBJECT_QUIMICAL);
		
		Assert.assertEquals(subjectIdExpected, subject.getSubjectId());
		Assert.assertEquals(subjectNameExpected, subject.getSubjectName());
		Assert.assertEquals(descriptionExpected, subject.getDescription());
	}
	
	@Test
	public void createSubjectUsedConstructorReference() {
		final int laboratoryNumberIdExpected = 1;
		final int subjectIdExpected = 3;
		final String subjectNameExpected = "Phisical";
		final String descriptionExpected = "Subject Phisical";
		
		final Laboratory laboratory = (Laboratory)applicationContext.getBean(LABORATORY_PHISICAL);
		
		Assert.assertEquals(laboratoryNumberIdExpected, laboratory.getLaboratoryNumber());
		Assert.assertEquals(subjectIdExpected, laboratory.getSubject().getSubjectId());
		Assert.assertEquals(subjectNameExpected, laboratory.getSubject().getSubjectName());
		Assert.assertEquals(descriptionExpected, laboratory.getSubject().getDescription());
	}
}
