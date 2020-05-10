package com.KiteSchoolDashboard.service;

import java.util.Date;
import java.util.List;

import com.KiteSchoolDashboard.global.Lesson;

public class lessonServiceImpl implements LessonDao {

	@Override
	public List<Lesson> getAllLessons() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Lesson> getDayLessons(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Lesson getLesson(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Lesson> getLessons(String[] ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateLesson(Lesson lesson, String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] updateLessons(Lesson lessons, String[] ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteLesson(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteLessons(String[] ids) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String createLesson(Lesson lesson) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] createLessons(List<Lesson> lessons) {
		// TODO Auto-generated method stub
		return null;
	}

}
