package seleniumPackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenAmazon {

	public static void main(String[] args) {
		
		// Set the path of driver 
		  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe" );
		// Create the object of the chromedriver browser 
	        ChromeDriver browserDriver = new ChromeDriver();
		// pass the link of website in get method 
	        browserDriver.get("http://www.amazon.com/");

	}

}
