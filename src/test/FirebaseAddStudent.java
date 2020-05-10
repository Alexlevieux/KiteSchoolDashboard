package test;



import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import com.KiteSchoolDashboard.firebase.FirebaseConfig;
import com.KiteSchoolDashboard.global.Student;
import com.google.api.core.ApiFuture;

import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.DatabaseReference.CompletionListener;

import com.sun.javafx.binding.Logging;






public class FirebaseAddStudent implements AsyncTestable {
 DatabaseReference db;
 DatabaseReference dbRef;
 Student alex;
List<Object> lessons;
 ApiFuture<String> apifuture;
 
 //implement a result string
	String finalResult = "";
 
 //run onFinish() onAsyncfinished with the logging information passed in the string
    public void onFinish(String result) {
    	finalResult = result;
    }

 //run listen() at the end of start() implementation
    public void listen()  {
    	while (finalResult.isEmpty()) {
    		try {
				wait(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		
    	}
    	
    }
	@Override
	public String start() {
		
		
		 lessons = new ArrayList<Object>() ;
		 try {
			db = FirebaseConfig.init().child("student");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 alex = new Student(lessons, 2, "1","Alexandre", "LEVIEUX",0);
		 db = db.child(alex.getId());
		 db.setValue(alex,new CompletionListener() {

				@Override
				public void onComplete(DatabaseError error, DatabaseReference ref) {
					// TODO Auto-generated method stub
			
					dbRef = ref;
					onFinish(AsyncTestable.SUCCESS + " with Reference : " + dbRef.toString());
					
					
				}
				
			});
		 
		
			listen();
		
		return finalResult;
	
		 
		 
		 
		
		
	
		
		
		 
	}
	


	}


