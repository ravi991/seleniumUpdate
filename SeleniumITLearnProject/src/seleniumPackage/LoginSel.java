package seleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		ChromeDriver browserObject = new ChromeDriver();
		browserObject.get("https://www.itlearn360.com/");
		browserObject.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		browserObject.findElement(By.id("loginlabel")).click();
		
		browserObject.findElement(By.name("log")).sendKeys("raviranjancs");
		browserObject.findElement(By.id("user_pass")).sendKeys("raviranjancs1234@");
		browserObject.findElement(By.id("wp-submit")).click();
		
		browserObject.close();
	}

}
