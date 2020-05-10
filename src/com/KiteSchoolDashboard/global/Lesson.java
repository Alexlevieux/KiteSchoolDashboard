package com.KiteSchoolDashboard.global;

import java.util.List;

public abstract class Lesson {

	protected boolean completed;

	protected int date;

	protected String id;
	protected int lenghtInHour;
	protected List<String> instructors;

	public Lesson(int date, List<String> teachers, boolean completed, int lenghtInHour, String id) {
		super();
		this.date = date;
		this.instructors = teachers;
		this.completed = completed;
		this.lenghtInHour = lenghtInHour;
		this.id = id;
	}

	public int getDate() {
		return date;
	}

	public String getId() {
		return id;
	}

	
	public int getLenghtInHour() {
		return lenghtInHour;
	}

	public List<String> getTeachers() {
		return instructors;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public void setId(String id) {
		this.id = id;
	}

	

	public void setLenghtInHour(int lenghtInHour) {
		this.lenghtInHour = lenghtInHour;
	}

	public void setTeachers(List<String> teachers) {
		this.instructors = teachers;
	}

}
