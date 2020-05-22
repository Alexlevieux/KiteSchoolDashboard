package com.KiteSchoolDashboard.global;

import java.util.List;

public class Lesson {

	protected boolean completed;

	protected long dateTime;

	protected String id;

	protected List<Object> instructors;
	protected int lenghtInHour;
	protected String lessonType;

	public Lesson() {

	}

	public Lesson(long date, List<Object> instructors, int lenghtInHour, String id) {
		super();
		this.dateTime = date;
		this.instructors = instructors;
		this.completed = false;
		this.lenghtInHour = lenghtInHour;
		this.id = id;
	}

	public long getDateTime() {
		return dateTime;
	}

	public String getId() {
		return id;
	}

	public List<Object> getInstructors() {
		return instructors;
	}

    public void setInstructors(List<Object> instructors) {
		this.instructors = instructors;
	}


	

	public int getLenghtInHour() {
		return lenghtInHour;
	}

	public String getLessonType() {
		return lessonType;
	}

	public StudentLesson getStudentLesson(String level, String comment, boolean isCompleted, int hours) {
		StudentLesson studentLesson = new StudentLesson(this);
		studentLesson.setStudentLevel(level);
		studentLesson.setComment(comment);
		studentLesson.setCompleted(isCompleted);
		studentLesson.setLenghtInHour(hours);

		return studentLesson;
	}



	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	public void setDateTime(long dateTime) {
		this.dateTime = dateTime;
	}

	public void setId(String id) {
		this.id = id;
	}


	public void setLenghtInHour(int lenghtInHour) {
		this.lenghtInHour = lenghtInHour;
	}

	public void setLessonType(String lessonType) {
		this.lessonType = lessonType;
	}


}
