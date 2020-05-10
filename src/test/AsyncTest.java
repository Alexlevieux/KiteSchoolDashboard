package test;





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
