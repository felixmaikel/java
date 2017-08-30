package es.springstudy.services;

public class FactoryService {

	private static SubjectService subjectService = SubjectService.createSubjectServiceInstance(7);
	private static LaboratoryService laboratoryService = LaboratoryService.createLaboratoryServiceInstance();
	
	public FactoryService() {
		
	}
	
	public SubjectService createSubjectServiceInstance() {
		return subjectService;
	}
	
	public LaboratoryService createLaboratoryServiceInstance() {
		return laboratoryService;
	}
}
