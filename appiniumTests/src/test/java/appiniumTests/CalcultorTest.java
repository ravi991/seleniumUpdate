package appiniumTests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;



public class CalcultorTest {
	
	static AppiumDriver driver;
	
	

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
			openCalculator();
		} catch (Exception  e) {
		System.out.println(e.getMessage());
		System.out.println(e.getCause());
		System.out.println(e.getStackTrace());
		}

	}

	public static void openCalculator() throws Exception
	{
		DesiredCapabilities cap= new DesiredCapabilities();
		
		cap.setCapability("Device Name ", "Ravi's POCO X3");
		cap.setCapability("udid", "e4ca8975");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "12.5.7");
		
		cap.setCapability("appPackage", "com.miui.compass");
		cap.setCapability("appActivity", "com.miui.compass.CompassActivity");
		
		
		driver= new AppiumDriver( new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println("Start Appilcation ");
		
	}
	
}
