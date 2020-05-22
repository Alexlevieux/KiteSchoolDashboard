package com.KiteSchoolDashboard.global;



public class StudentLesson extends Lesson {
	public String studentLevel;
	public String comment;
	
   public StudentLesson(Lesson lesson) {
	   super(lesson.dateTime ,lesson.instructors,lesson.lenghtInHour, lesson.id);
	   
   }
   

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}


	public String getStudentLevel() {
		return studentLevel;
	}

	public void setStudentLevel(String studentLevel) {
		this.studentLevel = studentLevel;
	}
}


