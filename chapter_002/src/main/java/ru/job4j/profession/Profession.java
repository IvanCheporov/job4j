package ru.job4j.profession;
/**
 * @author Ivan Cheporov (vanessok@mail.ru)
 * @version $1.0$
 * @since 04.12.2018.
 */


public class Profession {
	
	private String name;
	private String specialization;
	
	public Profession() {
	}
	
	public Profession(String name, String specialization) {
		this.name = name;
		this.specialization = specialization;
	}
	
	public String getname() {
		return this.name;
	}
	
	public String getSpecialization() {
		return this.name;
	}
}