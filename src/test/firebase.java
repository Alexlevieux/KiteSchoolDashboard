package test;



import java.io.IOException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import com.KiteSchoolDashboard.firebase.FirebaseConfig;
import com.google.cloud.firestore.Firestore;
import static org.hamcrest.CoreMatchers.instanceOf;



public class firebase {



	@Before
	public void setUp() throws Exception {
	
		
	}

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		try {
			Assert.assertThat( FirebaseConfig.init(), instanceOf(Firestore.class));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
