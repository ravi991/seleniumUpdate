package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver browserDriver;
		// Set the path of chromeDriver browser
	        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		// Intialize value to the chromebrowser driver
	        browserDriver = new ChromeDriver();
		// pass the link of driver 
	        browserDriver.get("https://admin-demo.nopcommerce.com/login");
	        
	        WebElement email =browserDriver.findElement(By.id("Email"));
	        email.clear();
	        email.sendKeys("admin@yourstore.com");
	        
	        WebElement pass =browserDriver.findElement(By.id("Password"));
	        pass.clear();
	        pass.sendKeys("admin");
	        
	        browserDriver.findElement(By.className("button-1")).click();
	        
	}

}
