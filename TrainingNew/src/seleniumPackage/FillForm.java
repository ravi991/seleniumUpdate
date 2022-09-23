package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FillForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe");
        ChromeDriver driver = new ChromeDriver();

        // pass url
        driver.get("http://training.qaonlinetraining.com/testPage.php");
        
        driver.findElement(By.name("name")).sendKeys("Harry");
        
        driver.findElement(By.name("email")).sendKeys("infotech@gmail.com");
        
        driver.findElement(By.name("website")).sendKeys("ItLearn360");
        
        driver.findElement(By.name("comment")).sendKeys("The is a good website");
        
        driver.findElement(By.name("submit")).click();

	}

}
