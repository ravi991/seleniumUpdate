package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fill_Form {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// In WebDriver we can intialize value of all drivers.So we can say WebDriver is universal class inside which all browser are defined.
	    WebDriver browserDriver;
	  // Set the path of chromeDriver browser
	    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
	    // Create the object of the chromeBrowser driver
	    browserDriver = new ChromeDriver();
	    // opening website for form fill up
	    browserDriver.get("http://www.training.qaonlinetraining.com/testPage.php");
	    browserDriver.findElement(By.name("name")).sendKeys("DemoName");
	    
	    browserDriver.findElement(By.name("email")).sendKeys("DemoEmail@demo.com");
	    
	    browserDriver.findElement(By.name("email")).sendKeys("DemoEmail@demo.com");
	    
	    browserDriver.findElement(By.name("website")).sendKeys("ITLearn360");
	    
	    browserDriver.findElement(By.name("comment")).sendKeys("This is a good website");
	    
	    browserDriver.findElement(By.name("submit")).click();
	    
	}

}
