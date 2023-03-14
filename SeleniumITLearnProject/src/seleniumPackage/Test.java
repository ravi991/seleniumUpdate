package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	      ChromeDriver  driver= new ChromeDriver();
	        driver.get("http://ect.itlearn360.com/customer/login");
	        driver.manage().window().maximize();
	        
	        driver.findElement(By.xpath("/html/body/nav/div/ul/li[2]/a")).click();
	        driver.findElement(By.name("email")).sendKeys("training@infotek-solutions.com");
	        driver.findElement(By.name("password")).sendKeys("Test1234$");
	        driver.findElement(By.id("customerloginForm")).click();
	        
	        
	    	WebDriverWait wait=new WebDriverWait(driver, 10);
	    	
	    	WebElement home;
			// 5. Locate the gmail element and apply the wait and until method to the element.
	    	home= wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText( "Home")));
	    	home.click();
	    	driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/p/a")).click();
	    	
	    	WebElement cart= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "/html/body/nav/div/ul/li[3]/a")));
	    	cart.click();
	    	
	    	
	    	driver.findElement(By.linkText("Checkout")).click();
	    	
	    	
	}

}
