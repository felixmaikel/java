package es.springstudy.models;

import java.util.Properties;

public class Person {

	protected String nif;
	protected String name;
	protected int years;
	protected Properties emails;
	
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

	public Properties getEmails() {
		return emails;
	}

	public void setEmails(Properties emails) {
		this.emails = emails;
	}
	
}
