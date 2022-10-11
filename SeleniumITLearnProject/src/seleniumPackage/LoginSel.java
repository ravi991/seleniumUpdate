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
		
		// Search Courses 
		browserObject.findElement(By.name("search_course")).sendKeys("Automation with Selenium WebDriver ");
		browserObject.findElement(By.xpath("//*[@id=\"primary_menu\"]/nav[1]/form/button")).click();
					
		browserObject.navigate().back();

		browserObject.findElement(By.xpath("//*[@id=\"login-list\"]/li[1]/a")).click();
		browserObject.findElement(By.xpath("//*[@id=\"learn-press-user-profile\"]/ul/li[2]/a")).click();
		browserObject.findElement(By.xpath("//*[@id=\"mc\"]/div/ul/li[1]/a[1]/h3")).click();
		browserObject.navigate().back();
		browserObject.findElement(By.className("btn-primary")).click();
		
//		browserObject.close();
	}

}
