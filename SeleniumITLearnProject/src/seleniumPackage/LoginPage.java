package seleniumPackage;

import static org.testng.Assert.assertEquals;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPage {
	WebDriver browserObject ;
		@BeforeTest
		public void setPath()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
			 browserObject = new ChromeDriver();
			browserObject.get("https://www.itlearn360.com/");
			
		}
		
		@Test(priority =1)
		public void loginDetails()
		{
			browserObject.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			browserObject.findElement(By.id("loginlabel")).click();
			
			browserObject.findElement(By.name("log")).sendKeys("raviranjancs");
			browserObject.findElement(By.id("user_pass")).sendKeys("raviranjancs1234@");
			browserObject.findElement(By.id("wp-submit")).click();
		}
		
		@Test(priority =2)
		public void coursesSearch()
		{
			// Search Courses 
			browserObject.findElement(By.name("search_course")).sendKeys("Automation with Selenium WebDriver ");
			browserObject.findElement(By.xpath("//*[@id=\"primary_menu\"]/nav[1]/form/button")).click();
			
			browserObject.navigate().back();
		}
		
		
		@Test(priority =3)
		public void dashboardPage()
		{
			browserObject.findElement(By.xpath("//*[@id=\"login-list\"]/li[1]/a")).click();
			String expectedValue= "Dashboard";
			String actualValue = browserObject.findElement(By.xpath("//*[@id=\"learn-press-user-profile\"]/ul/li[1]/a")).getText();
			System.out.println(actualValue);
			Assert.assertEquals(actualValue, expectedValue);
		}
		
		@Test(priority =4)
		public void courseOption()
		{
			browserObject.findElement(By.xpath("//*[@id=\"learn-press-user-profile\"]/ul/li[2]/a")).click();
			browserObject.findElement(By.xpath("//*[@id=\"mc\"]/div/ul/li[1]/a[1]/h3")).click();
			browserObject.navigate().back();
			browserObject.findElement(By.className("btn-primary")).click();

			
		}
		@AfterTest
		public void closeDriver()
		{
			browserObject.close();
		}
}
