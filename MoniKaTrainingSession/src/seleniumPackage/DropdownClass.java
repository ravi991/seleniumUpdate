package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		// 2. Initialize Webdriver object through ChromeDriver class.
        	WebDriver browserObject = new ChromeDriver();
		// 3. Open the form page http://training.qaonlinetraining.com/testPage.php
	        browserObject.get("http://training.qaonlinetraining.com/testPage.php");
		
		// 4. Select class is used in case of Dropdown. Select class object countrySelect specifies the webElement location.
	        Select countrySelect = new Select(browserObject.findElement(By.name("country")));
	        
		// 5. Using the object of Select class call the selectByVisibleText method and select text in dropdown
	        countrySelect.selectByVisibleText("USA"); //options [USA,India, Ethiopia,France]
	        //or
	        Thread.sleep(6000);
	        countrySelect.selectByVisibleText("France");
	        
	
	        
	       // Same explanation for skill dropdown 
	        Select skillSelect = new Select(browserObject.findElement(By.name("skill")));
	        Thread.sleep(6000);
	        //using skillSelect to select menu options -- Programming
	        skillSelect.selectByVisibleText("Programming");
	     
	        Thread.sleep(6000);
	        skillSelect.selectByVisibleText("Database");
	        System.out.println("selectByVisibleText(\"Database");
	        
	        Thread.sleep(6000);
	        // 6. Locate the send button and perform click
	        browserObject.findElement(By.name("submit")).click();
	        System.out.println("Form Fill-up Succesfull");
		// 7. Close the web browser
//	        browserObject.close();
	}

}
