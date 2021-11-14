package de.uni.koeln.se;

import java.util.ArrayList;

public class Course {
	public int id;
	public String name;
	public int maxCapacity;
	public boolean isFull;
	public Professor prof = new Professor();
	// public ArrayList <Student> student;
	public ArrayList <Exam> exam;

	public Course(int id, String name, int cap, Professor prof) {
		
	}
	/*
	 * public void Enroll(Student student) {
	 * }
	 * public void Apply(TA ta){
	 * }
	 */
	public void setMaxCap(int max) {
		
	}
	public Professor getProf() {
		return prof;
	}
	// public TA getTA(){return ta;}
	// public void setNewTA(TA ta){};
	public void setName(String s) {
		
	}
	
}
