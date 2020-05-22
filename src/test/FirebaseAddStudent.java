package test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.time.*;
import java.time.temporal.ChronoField;

import com.KiteSchoolDashboard.firebase.FirebaseConfig;
import com.KiteSchoolDashboard.global.KiteLesson;
import com.KiteSchoolDashboard.global.Lesson;
import com.KiteSchoolDashboard.global.Student;
import com.KiteSchoolDashboard.service.StudentDao;
import com.KiteSchoolDashboard.service.StudentServiceImpl;
import com.KiteSchoolDashboard.service.LessonDao;
import com.KiteSchoolDashboard.service.LessonServiceImpl;
import com.google.api.core.ApiFuture;

import com.google.firebase.database.DatabaseReference;

public class FirebaseAddStudent implements AsyncTestable {
	Student alex;
	Student aziz;
	Student azi;
	ApiFuture<String> apifuture;
	DatabaseReference db;
	DatabaseReference dbRef;
	// implement a result string
	String finalResult = "";
 Lesson lessonA;
 Lesson lessonB;
 Lesson lessonC;
	List<Object> lessons;

	// run listen() at the end of start() implementation
	public void listen() {
		while (finalResult.isEmpty()) {
			try {
				wait(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	// run onFinish() onAsyncfinished with the logging information passed in the
	// string
	public void onFinish(String result) {
		finalResult = result;
	}

	public String start() {

		lessons = new ArrayList<Object>();
		try {
			db = FirebaseConfig.init();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lessonA = new KiteLesson();
		lessonA.setDateTime(LocalDateTime.now().toEpochSecond(ZoneOffset.UTC));
		lessonA.setInstructors(new ArrayList<Object>() {
	
			private static final long serialVersionUID = 1L;

			{
				add("Alex");
				add("Aziz");
			}
		});
		lessonA.setLenghtInHour(3);
		DatabaseReference ref = db.child("/puremagic/lessons");
		
		LessonDao lessonDao = new LessonServiceImpl(ref);
		
		lessonDao.createLesson(lessonA);
		
		

		while (lessonDao.getAllLessons().isEmpty()) {
			try {

				wait(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
         
	
		 
	
		return lessonDao.getAllLessons().toString();

	}

}
