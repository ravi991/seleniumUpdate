package tesr;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlineForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	      ChromeDriver  driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      
	      driver.get("http://training.qaonlinetraining.com/testPage.php");
	      driver.findElement(By.name("name")).sendKeys("Infotek");
	      driver.findElement(By.name("email")).sendKeys("infotek@gmail.com");
	      driver.findElement(By.name("website")).sendKeys("www.itlearn360.com");
	      driver.findElement(By.name("comment")).sendKeys("Register yourself");
	      
	      driver.findElement(By.name("submit")).submit();
	        
	}

}
