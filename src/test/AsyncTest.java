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

public class AsyncTest {
 
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException  {

		for (String arg : args) {
		 
			
			AsyncTestable test = (AsyncTestable) Class.forName(arg).newInstance();
			 
			synchronized(test) {
		
				String result = test.start();
		        Logging.getLogger().info( "test result : " + arg + " is " + result );
			}
	    }
		
	}
	
}
