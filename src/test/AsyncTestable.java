package test;

public interface AsyncTestable {
	
   
	String SUCCESS = "success";
	String FAIL = "fail";
	
	String start();
    void onFinish(String result);
}
