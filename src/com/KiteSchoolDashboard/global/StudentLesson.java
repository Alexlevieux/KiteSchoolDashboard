package com.KiteSchoolDashboard.global;

import java.util.List;

public class StudentLesson extends Lesson {
	public String studentLevel;
	public String comment;

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String lessonType;
	
	
	public StudentLesson(KiteLesson l) {
		
		super(l.date, l.instructors, l.completed, l.lenghtInHour, l.id);
		this.setLessonType("kite");
		
	}

	public StudentLesson(Lesson l) {
		super(l.date, l.instructors, l.completed, l.lenghtInHour, l.id);
	}
	public StudentLesson(int date, List<String> instructors, boolean completed, int lenghtInHour, String id) {
		super(date, instructors, completed, lenghtInHour, id);
		// TODO Auto-generated constructor stub
	}
	public String getStudentLevel() {
		return studentLevel;
	}

	public void setStudentLevel(String studentLevel) {
		this.studentLevel = studentLevel;
	}

	public String getLessonType() {
		return lessonType;
	}

	public void setLessonType(String lessonType) {
		this.lessonType = lessonType;
	}

}
