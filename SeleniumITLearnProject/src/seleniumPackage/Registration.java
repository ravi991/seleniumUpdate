package seleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.chrome.ChromeDriver;


public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		ChromeDriver browserObject = new ChromeDriver();
		browserObject.get("http://demo.itlearn360.com/");
		browserObject.manage().window().maximize();
		browserObject.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
    	JavascriptExecutor js = (JavascriptExecutor) browserObject;
    	js.executeScript("window.scrollBy(0,350)", "");
    	
    	browserObject.findElement(By.xpath("//*[@id=\"training_process\"]/div[1]/p/a")).click();
    	
    	browserObject.findElement(By.name("user_login")).sendKeys("dem8891");
    	browserObject.findElement(By.name("user_email")).sendKeys("d@gmail.com");
    	
    	browserObject.findElement(By.name("user_fname")).sendKeys("Traineer");
    	browserObject.findElement(By.name("user_lname")).sendKeys("Demmo");
    	browserObject.findElement(By.name("country")).sendKeys("USA");
    	browserObject.findElement(By.name("contactno")).sendKeys("8899999900");
    	
    	browserObject.findElement(By.name("wp-submit")).click();
    
	}

}
