package es.springstudy.models;

public class Person {

	private String nif;
	private String name;
	private int years;
	
	public Person() {
		
	}

	public String getNif() {
		return nif;
	}

	public String getName() {
		return name;
	}

	public int getYears() {
		return years;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setYears(int years) {
		this.years = years;
	}
	
}
