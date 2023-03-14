package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form_Fill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		// 2. Initialize Webdriver object through ChromeDriver class. 
	        WebDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.amazon.com/ link using get method.
	        browserObject.get("http://training.qaonlinetraining.com/testPage.php");
	        
	        browserObject.findElement(By.name("name")).sendKeys("Demo");
	        
	        browserObject.findElement(By.id("eml")).sendKeys("demo@gmail.com");
	        
	        browserObject.findElement(By.name("website")).sendKeys("ItLearn360");
	        
	        browserObject.findElement(By.name("comment")).sendKeys("This is a good website");
	        
	        browserObject.findElement(By.name("submit")).click();
	        
	        browserObject.close();
	}

}
