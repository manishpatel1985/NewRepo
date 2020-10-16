package Base;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Listener.WebEventListener;

public class Base {
	
	public static WebDriver driver;
	
	
	
	
	public static void initialisation() throws MalformedURLException {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("firefox");
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(Platform.WINDOWS);
		
		ChromeOptions options = new ChromeOptions();
		options.merge(capabilities);
		
		String huburl= "http://192.168.0.28:12566/wd/hub";
		
		
		driver=new RemoteWebDriver(new URL(huburl),options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.co.uk");
		
	}
	
	public static void failedScreenShots(String methodname) {
		String datename = new SimpleDateFormat("yyyyMMDD").format(new Date());
		
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot, new File("C:\\Selenium\\manishSelenium\\manishSelenium\\FailedScreenShotMethods\\target\\"
		+methodname+datename+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void waitForElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 20 );
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();;
	}

}
