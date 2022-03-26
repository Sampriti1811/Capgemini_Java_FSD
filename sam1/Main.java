package sam1;


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Main {
	
	public static int calculate(int x,int y) {
		return x+y;
		
	}
	
	
	public static void main(String[] args) {
		Result r=JUnitCore.runClasses(Junit2.class);
		
		for(Failure f:r.getFailures()) {
			System.out.println(f.toString());
		}
	}
	

}
