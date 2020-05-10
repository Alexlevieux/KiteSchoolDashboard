package com.KiteSchoolDashboard.service;

import java.util.Date;
import java.util.List;

import com.KiteSchoolDashboard.global.Lesson;

public interface LessonDao {
	
	
	public List<Lesson> getAllLessons();
	public List<Lesson> getDayLessons(Date date);
	public Lesson getLesson(String id);
	public List<Lesson> getLessons(String[] ids);
	public String updateLesson(Lesson lesson, String id );
	public String[] updateLessons(Lesson lessons , String[] ids);
	public boolean deleteLesson(String id);
	public boolean deleteLessons(String[] ids);
	public String createLesson(Lesson lesson);
	public String[] createLessons(List<Lesson> lessons);
	
}
