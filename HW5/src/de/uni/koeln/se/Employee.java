package de.uni.koeln.se;

public class Employee {
	public String name;
	public int eld;
	// Gehalt eines Mitarbeiters
	public int salary;
	
	// Professor is a kind of employee
	Professor P1 = new Professor();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEld() {
		return eld;
	}
	public void setEld(int eld) {
		this.eld = eld;
	}
	
}
