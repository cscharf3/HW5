package de.uni.koeln.se;

public class Question {
	public String task;
	public int maxValue;
	public int q_id;
	
	public Question(int id, String task, int value) {
		System.out.println("Question Nr. ..");
	}
	
	
	public String getTask() {
		return task;
	}


	public void setTask(String task) {
		this.task = task;
	}


	public int getMaxValue() {
		return maxValue;
	}


	public void setMaxValue(int maxValue) {
		this.maxValue = maxValue;
	}


	public int getQ_id() {
		return q_id;
	}


	public void setQ_id(int q_id) {
		this.q_id = q_id;
	}
	
	

}
