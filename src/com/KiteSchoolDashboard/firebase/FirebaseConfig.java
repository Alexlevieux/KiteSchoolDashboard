package com.KiteSchoolDashboard.firebase;

import java.io.FileInputStream;
import java.io.IOException;


import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.cloud.firestore.Firestore;


public class FirebaseConfig {



    public static Firestore fireStore() {
        return FirestoreClient.getFirestore();
    }


	static String path = "src/serviceAccountKey.json";

	
	static String dbUrl = "https://bookboard-list.firebaseio.com";


	public static DatabaseReference init() throws IOException {

		FileInputStream refreshToken = new FileInputStream(path);
 
		FirebaseOptions options = new FirebaseOptions.Builder()
		    .setCredentials(GoogleCredentials.fromStream(refreshToken))
		    .setDatabaseUrl(dbUrl)
		    .build();
        if (FirebaseApp.getApps().isEmpty()) {
		FirebaseApp.initializeApp(options);}
        
		DatabaseReference db =  FirebaseDatabase.getInstance().getReference();
		
		return db;
		
	}
}
