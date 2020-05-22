package test;








import java.util.logging.*;

public class AsyncTest {
 
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException  {

		for (String arg : args) {
		 
			
			AsyncTestable test = (AsyncTestable) Class.forName(arg).newInstance();
			 
			synchronized(test) {
		
				String result = test.start();
		        Logger.getAnonymousLogger().info( "test result : " + arg + " is " + result );
			}
	    }
		
	}
	
}
