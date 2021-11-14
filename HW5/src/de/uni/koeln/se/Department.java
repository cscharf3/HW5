package de.uni.koeln.se;

import java.util.ArrayList;

public class Department {
	public String name;
	
	
	//0..* employees
	public ArrayList<Employee> employee;
	
	// 1 prof Stuhl reservieren
	public Professor chair = new Professor();
	//0..* courses
	public ArrayList<Course> courses;
}
