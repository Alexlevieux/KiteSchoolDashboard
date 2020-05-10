package com.KiteSchoolDashboard.global;

import java.util.List;

public class SupLesson extends Lesson {

	private List<Object> students;
	private String supLessonType;
	private String supSpot;
	private String weatherCondition;

	
	public SupLesson(Lesson lesson) {
		super(lesson.date, lesson.instructors, lesson.completed, lesson.lenghtInHour, lesson.id);
	}

	public SupLesson(int date, List<String> instructors, boolean completed, int lenghtInHour, String id,
			List<Object> students, String supLessonType, String supSpot, String weatherCondition) {
		super(date, instructors, completed, lenghtInHour, id);
		this.students = students;
		this.supLessonType = supLessonType;
		this.supSpot = supSpot;
		this.weatherCondition = weatherCondition;
	}

	public List<Object> getStudents() {
		return students;
	}

	public String getSupLessonType() {
		return supLessonType;
	}

	public String getSupSpot() {
		return supSpot;
	}

	public String getWeatherCondition() {
		return weatherCondition;
	}

	public void setStudents(List<Object> students) {
		this.students = students;
	}

	public void setSupLessonType(String supLessonType) {
		this.supLessonType = supLessonType;
	}

	public void setSupSpot(String supSpot) {
		this.supSpot = supSpot;
	}
	public void setWeatherCondition(String weatherCondition) {
		this.weatherCondition = weatherCondition;
	}

}
