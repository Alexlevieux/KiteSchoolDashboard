package test;

import java.io.IOException;

import com.KiteSchoolDashboard.firebase.FirebaseConfig;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;

public class FirebaseInitGetRef implements AsyncTestable {
	DatabaseReference db;
	String finalResult = "";


	public String start() {
		// TODO Auto-generated method stub
		try {
			FirebaseConfig.init().getRef().addListenerForSingleValueEvent(new ValueEventListener() {

				
				public void onDataChange(DataSnapshot snapshot) {
					// TODO Auto-generated method stub
					onFinish(snapshot.getRef().toString());
				}

				public void onCancelled(DatabaseError error) {
					// TODO Auto-generated method stub

				}

			});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		listen();
		return finalResult;
	}

	
	public void onFinish(String result) {
		// TODO Auto-generated method stub
		finalResult = result;
	}

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

}
