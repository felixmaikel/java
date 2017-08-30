package es.springstudy.models;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import es.springstudy.models.tools.ContextUtils;

public class PersonTest {

	private static final String PERSON_1 = "person1";
	private static final String TEACHER_1 = "teacher1";
	private static final String TEACHER_2 = "teacher2";
	private static final String TEACHER_3 = "teacher3";
	private ApplicationContext applicationContext;
	
	@Before
	public void loadContext() {
		applicationContext = new ClassPathXmlApplicationContext(ContextUtils.APPLICATION_CONTEXT_XML);
	}
	
	@Test
	public void createPersonBySetValues() {
		final String nifExpected = "51111111J";
		final String nameExpected = "Jose Garcia";
		final int yearsExpected = 30;
		
		final Person person = (Person)applicationContext.getBean(PERSON_1);
		
		Assert.assertEquals(nifExpected, person.getNif());
		Assert.assertEquals(nameExpected, person.getName());
		Assert.assertEquals(yearsExpected, person.getYears());
	}
	
	@Test
	public void createPersonBySetReference() {
		final String nifExpected = "51111111J";
		final String nameExpected = "Jose Garcia";
		final int yearsExpected = 30;
		final int subjectIdExpected = 1;
		final String subjectNameExpected = "Mathematic";
		final String descriptionExpected = "Subject mathematic";
		
		final Teacher teacher = (Teacher)applicationContext.getBean(TEACHER_1);
		
		Assert.assertEquals(nifExpected, teacher.getNif());
		Assert.assertEquals(nameExpected, teacher.getName());
		Assert.assertEquals(yearsExpected, teacher.getYears());
		Assert.assertEquals(subjectIdExpected, teacher.getSubject().getSubjectId());
		Assert.assertEquals(subjectNameExpected, teacher.getSubject().getSubjectName());
		Assert.assertEquals(descriptionExpected, teacher.getSubject().getDescription());
	}
	
	@Test
	public void createPersonBySetReferenceBean() {
		final String nifExpected = "52222222J";
		final String nameExpected = "Carmen Garcia";
		final int yearsExpected = 25;
		final int subjectIdExpected = 2;
		final String subjectNameExpected = "History";
		final String descriptionExpected = "Subject History";
		
		final Teacher teacher = (Teacher)applicationContext.getBean(TEACHER_2);
		
		Assert.assertEquals(nifExpected, teacher.getNif());
		Assert.assertEquals(nameExpected, teacher.getName());
		Assert.assertEquals(yearsExpected, teacher.getYears());
		Assert.assertEquals(subjectIdExpected, teacher.getSubject().getSubjectId());
		Assert.assertEquals(subjectNameExpected, teacher.getSubject().getSubjectName());
		Assert.assertEquals(descriptionExpected, teacher.getSubject().getDescription());
	}
	
	@Test
	public void createPersonBySetInnerBean() {
		final String nifExpected = "5333333J";
		final String nameExpected = "Juana Garcia";
		final int yearsExpected = 35;
		final int subjectIdExpected = 5;
		final String subjectNameExpected = "Art";
		final String descriptionExpected = "Subject Art";
		
		final Teacher teacher = (Teacher)applicationContext.getBean(TEACHER_3);
		
		Assert.assertEquals(nifExpected, teacher.getNif());
		Assert.assertEquals(nameExpected, teacher.getName());
		Assert.assertEquals(yearsExpected, teacher.getYears());
		Assert.assertEquals(subjectIdExpected, teacher.getSubject().getSubjectId());
		Assert.assertEquals(subjectNameExpected, teacher.getSubject().getSubjectName());
		Assert.assertEquals(descriptionExpected, teacher.getSubject().getDescription());
	}
}
