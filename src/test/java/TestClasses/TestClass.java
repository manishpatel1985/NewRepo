package TestClasses;




import org.openqa.selenium.By;
import org.testng.Assert;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;



import Base.Base;



public class TestClass extends Base {
	


	
	
	
	
	

	@BeforeMethod
	public void setUp() {
		initialisation();
		
	}
	
	@Test(priority=1)
	
	public void serchTest() {
		String title=driver.getTitle();
		Assert.assertEquals(title, "Google");
		
	}
	
	@Test(priority=2)
	public void loginTest() {
		boolean btn =driver.findElement(By.xpath("//div[@class='tfB0Bf']")).isEnabled();
		Assert.assertTrue(btn);
		
	}
	
	
	
	
	@AfterMethod
	public void tearDown() {
		
		
		driver.quit();
	}
	
	
}
