package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Set the path of chromeDriver browser
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
				
				// Intialize value to the chromeDriver browser
		        	WebDriver browserDriver = new ChromeDriver();
				// pass the link of website
			        browserDriver.get("http://training.qaonlinetraining.com/testPage.php");
				
				// Select class is used in case of dropdown and pass the value of element .
			        Select countrySelect = new Select(browserDriver.findElement(By.name("country")));
			        
			        
				// using the countrySelect call selectByVisibleText method and select the text in dropdown
			        countrySelect.selectByVisibleText("USA"); //options [USA,India, Ethiopia,France]
			        //or
			        countrySelect.selectByVisibleText("France");
			        
			        //Same explanation for skill dropdown
			        Select skillSelect = new Select(browserDriver.findElement(By.name("skill")));
			        //using skillSelect to select menu options -- Programming
			        skillSelect.selectByVisibleText("Programming");
			        System.out.println("selectByVisibleText(\"Programming");
			        //OR
			        //using skillSelect to select menu options -- Database
			        skillSelect.selectByVisibleText("Database");
			        System.out.println("selectByVisibleText(\"Database");
			        
			        //Click on Send Button
			        browserDriver.findElement(By.name("submit")).click();
			        System.out.println("Form Fill-up Succesfull");
				// quit method close all the browser open in screen
//			        browserDriver.quit();
	}

}
