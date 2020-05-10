package test;

import static org.junit.Assert.*;
import com.KiteSchoolDashboard.global.*;
import java.util.*;


import org.junit.Before;
import org.junit.Test;

public class modelTest {
	
    StudentLesson lesson1;
    StudentLesson lesson2;

	
	
	
	public Student alex; 
	  List<Object> lessons;
	  List<Object> students;
	  public KiteLesson kiteLesson;
	 List<String> instructors;

	@Before
	public void setUp() throws Exception {
     instructors = new ArrayList<String>();
     instructors.add( "Alex");
     instructors.add( "Aziz");
     students = new ArrayList<Object>();
     lessons = new ArrayList<Object>() ;
   
     
     
     alex = new Student(lessons, 2, "1","Alexandre", "LEVIEUX",0);
     students.add(alex);
     kiteLesson = new KiteLesson(10255654, instructors ,false,3, "1", "dolly", "northerly, really gusty", students);
     lesson1 = new StudentLesson(kiteLesson);
     lesson1.setStudentLevel("body dragging");
     lesson1.setCompleted(true);
     lessons.add(lesson1);
     alex.setLessons(lessons);
    	  
     
	}

	@Test
	public void test() {
		assertEquals(alex.getId(), "1");
		assertEquals(alex.getFirstName(),"Alexandre" );
		assertEquals(alex.getSurName(),"LEVIEUX" );
		assertEquals(alex.getLessons(), lessons );
		assertEquals(alex.getNumberOfLessons(), 2 );
		assertEquals(alex.getLessonsBalance(), 0 );
		assertEquals(kiteLesson.getKiteSpot(), "dolly");
		assertEquals(kiteLesson.getLenghtInHour(),3 );
		assertEquals(kiteLesson.getId(),"1" );
		assertFalse(kiteLesson.isCompleted() );
		assertTrue(kiteLesson.getStudents().get(0).equals(alex) );
		assertEquals(kiteLesson.getDate(), 10255654 );
        assertEquals(((StudentLesson) alex.getLessons().get(0)).getStudentLevel(), "body dragging");
        


	}

}
