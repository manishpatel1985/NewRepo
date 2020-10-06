package Base;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class TestListener  {

	int i =0;
	int j =2;
	
	@Test
	public void verifyMessage() {
		System.out.println(i+j);
	}
	
}
