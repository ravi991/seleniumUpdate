package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		// 2. Initialize WebDriver object through ChromeDriver class.
		WebDriver browserDriver = new ChromeDriver();
		
		// 3. Open the web page https://www.amazon.com/
		 browserDriver.get("https://www.amazon.com/");
		
		// 4. Thread.sleep is used to hold the part of code for given time limit. In this case take mouse over the thread and add Interrupted exception to this method
	        Thread.sleep(3000);
		// 5. Get the reference of element to mouse over.
	        WebElement element = browserDriver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]")) ;
	        
		
	      
		// 6. In case of Mouse Over we use Actions class.Create refernce and pass the driver to the reference
	        Actions action = new Actions(browserDriver);
	        System.out.println("Mouse is over the - HELLO, SIGN IN - option");
	        
	        // 7. Using the action reference call the moveToElement method and pass  element to mouse over
	        action.moveToElement(element).build().perform();
	        //Thread.sleep(3000);
		// 8. Select a element from the pop up box and perform click
	        browserDriver.findElement(By.xpath("//span[contains(text(),'Create a List')]")).click();
		// 9. Close the browser
	        System.out.println("Clicked");
	}

}
