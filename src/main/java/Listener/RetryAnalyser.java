package Listener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import Base.Base;

public class RetryAnalyser extends Base implements IRetryAnalyzer{
	
	int count = 0;
	int retrylimit = 1;

	public boolean retry(ITestResult arg0) {
		if(count<retrylimit) {
			count++;
			return true;
		}
		return false;
	}

}
