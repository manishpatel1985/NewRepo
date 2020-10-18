package TestClasses;




import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import Base.Base;
import Base.NewBaseClass;



public class TestClass extends NewBaseClass  {

	@Test(priority=1)
	public void serchTest() {
		String title=driver.getTitle();
		Assert.assertEquals(title, "Google");
	}
	
	
	
	
	
	
	
	
}
