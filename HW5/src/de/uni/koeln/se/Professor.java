package de.uni.koeln.se;

import java.util.ArrayList;

public class Professor extends Employee {
	// extends: generalization; Prof subclass of Empl
	// public Course courses;
	public Exam exam;
	public ArrayList <Course> courses;
	public void publish_course() {
		System.out.println("The courses are...");
		}
	public void assign_TA() {
		System.out.println("TA assigned");
	}
	public void addNewCourse() {
		System.out.println("New course added!");
	}

}
