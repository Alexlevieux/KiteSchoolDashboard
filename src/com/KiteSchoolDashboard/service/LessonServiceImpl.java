package com.KiteSchoolDashboard.service;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import org.threeten.bp.Instant;

import java.time.format.DateTimeFormatter;

import com.KiteSchoolDashboard.global.Lesson;
import com.KiteSchoolDashboard.global.Student;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ValueEventListener;

public class LessonServiceImpl implements LessonDao {
	private List<Lesson> lessons; 
	DatabaseReference ref;
	public LessonServiceImpl(DatabaseReference reference) {
		super();
		lessons =  new ArrayList<Lesson>();
		ValueEventListener listener = new ValueEventListener() {

			@Override
			public void onDataChange(DataSnapshot snapshot) {
				// TODO Auto-generated method stub
				Logger.getAnonymousLogger().info(String.valueOf(snapshot.getChildrenCount()));
				GenericTypeIndicator<Lesson> t = new GenericTypeIndicator<Lesson>() {};
				if (!lessons.isEmpty()) {
					lessons.clear();
				}
				
			   for (DataSnapshot snap : snapshot.getChildren()) {
				
				
					lessons.add(snap.getValue(t));
					Logger.getAnonymousLogger().info(String.valueOf(snap.getKey()));

				}
			}

			@Override
			public void onCancelled(DatabaseError error) {
				// TODO Auto-generated method stub
				
			}
			
		};
		
		this.ref= reference;
		reference.addValueEventListener(listener);
	}

	
	public List<Lesson> getAllLessons() {
		Logger.getAnonymousLogger().info(String.valueOf(lessons.size()));
		return this.lessons;
	}


	public List<Lesson> getDayLessons(LocalDate date) {
		
        List<Lesson> resultLesson = new ArrayList<Lesson>();
        
        resultLesson = lessons;
        if (result.isEmpty()) {
        	return resultLesson;
		}else {
			resultLesson.removeIf( lesson ->  date.toEpochDay() == Instant.ofEpochSecond(lesson.getDateTime()).getLong(ChronoField.EPOCH_DAY0))));
         return resultLesson;
		}
		
		
	}

	
	public Lesson getLesson(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Lesson> getLessons(String[] ids) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String updateLesson(Lesson lesson, String id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String[] updateLessons(Lesson lessons, String[] ids) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public boolean deleteLesson(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean deleteLessons(String[] ids) {
		// TODO Auto-generated method stub
		return false;
	}


	public String createLesson(Lesson lesson) {
		
		DatabaseReference uidRef = ref.push();
		lesson.setId(uidRef.getKey());
	
		uidRef.setValueAsync(lesson);
		// TODO Auto-generated method stub
		return uidRef.getKey() ;
	}

	
	public String[] createLessons(List<Lesson> lessons) {
		
		
		// TODO Auto-generated method stub
		return null;
	}

}
