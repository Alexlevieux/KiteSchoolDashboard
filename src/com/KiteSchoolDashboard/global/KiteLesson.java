package com.KiteSchoolDashboard.global;

import java.util.List;

public class KiteLesson extends Lesson {

	private String kiteLessonType;

	public String getKiteLessonType() {
		return kiteLessonType;
	}

	public void setKiteLessonType(String kiteLessonType) {
		this.kiteLessonType = kiteLessonType;
	}

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

	public KiteLesson(int date, List<String>instructors, boolean completed, int lenghtInHour, String id, String kiteSpot,
			String description, List<Object> students) {
		super(date, instructors, completed, lenghtInHour, id);
		this.kiteSpot = kiteSpot;
		this.weatherCondition = description;
		this.students = students;
	}

}
