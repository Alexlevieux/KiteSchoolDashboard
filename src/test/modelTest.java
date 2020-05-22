package test;

import static org.junit.Assert.*;

import com.KiteSchoolDashboard.global.KiteLesson;
import com.KiteSchoolDashboard.global.Lesson;
import com.KiteSchoolDashboard.global.Student;
import com.KiteSchoolDashboard.global.StudentLesson;
import com.KiteSchoolDashboard.service.StudentDao;
import com.KiteSchoolDashboard.service.StudentServiceImpl;
import com.google.api.core.ApiFuture;
import com.google.firebase.database.DatabaseReference;

import java.util.*;


import org.junit.Before;
import org.junit.Test;

public class modelTest {
	
	Student alex;
	Student aziz;
	ApiFuture<String> apifuture;
	DatabaseReference db;
	DatabaseReference dbRef;
	// implement a result string
	String finalResult = "";

	List<Object> lessons;
	@Before
	public void setUp()  {
	
		alex = new Student();
		alex.setLessons(lessons);
		alex.setFirstName("Alexandre");
		alex.setLessonsBalance(0);
		alex.setSurName("Levieux");
		aziz = new Student();
		aziz.setLessons(lessons);
		aziz.setFirstName("Aziz");
		aziz.setLessonsBalance(0);
		aziz.setSurName("kabour");
		DatabaseReference ref = db.child("/puremagic/students");
		
		
		StudentDao studentDao = new StudentServiceImpl(ref);
		
		List<Student> students = new ArrayList<Student>(){
			private static final long serialVersionUID = 1L;};
			
			students.add(alex);
			students.add(aziz);
			
     
	}

	@Test
	public void test() {
		
		


	}

}
