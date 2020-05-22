package com.KiteSchoolDashboard.global;

import java.util.List;

public class KiteLesson extends Lesson {

	public String getWeatherCondition() {
		return weatherCondition;
	}

	public void setWeatherCondition(String weatherCondition) {
		this.weatherCondition = weatherCondition;
	}

	private String kiteSpot;
	private String weatherCondition;
	private List<Object> students;

	public String getKiteSpot() {
		return kiteSpot;
	}

	public void setKiteSpot(String kiteSpot) {
		this.kiteSpot = kiteSpot;
	}

	public String getDescription() {
		return weatherCondition;
	}

	public void setDescription(String description) {
		this.weatherCondition = description;
	}

	public List<Object> getStudents() {
		return students;
	}

	public void setStudents(List<Object> students) {
		this.students = students;
	}

	public KiteLesson() {
		
		super();
		this.setLessonType("Kitesurf");
		
	}

	public KiteLesson(int date, List<Object> instructors, int lenghtInHour, String id) {
		super(date, instructors, lenghtInHour, id);
		this.setLessonType("Kitesurf");

	}

}
