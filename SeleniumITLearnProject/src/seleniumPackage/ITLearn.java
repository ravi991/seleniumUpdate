package seleniumPackage;




import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ITLearn {
	WebDriver browserObject ;
		@BeforeTest
		public void setPath()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
			 browserObject = new ChromeDriver();
			browserObject.get("http://demo.itlearn360.com/");
			
			browserObject.manage().window().maximize();
	browserObject.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
		}
		
		@Test(priority =1)
		public void loginDetails()
		{
			
			browserObject.findElement(By.id("loginlabel")).click();
			
			browserObject.findElement(By.name("log")).sendKeys("raviranjancs");
			browserObject.findElement(By.id("user_pass")).sendKeys("raviranjancs1234@");
			browserObject.findElement(By.id("wp-submit")).click();
		}
		
		@Test(priority =2)
		public void coursesSearch()
		{
			// Search Courses 
			browserObject.findElement(By.name("search_course")).sendKeys("Automation Testing with Junit");
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
		public void offeredAcademices() throws InterruptedException
		{
			Thread.sleep(6000);
			browserObject.findElement(By.xpath("//*[@id=\"learn-press-user-profile\"]/ul/li[3]")).click();
			
			browserObject.findElement(By.xpath("//*[@id=\"tab-academies\"]/div/div/ul/li[1]/form/div/button")).click();
		}
		
		@Test(priority =5)
		public void payment()
		{
			browserObject.findElement(By.xpath("//*[@id=\"learn-press-payment\"]/ul/li/label")).click();
			
			browserObject.findElement(By.xpath("//*[@id=\"learn-press-checkout-place-order\"]")).submit();
			
			WebElement cn = browserObject.findElement(By.xpath("//*[@id=\"card-element\"]/div/iframe"));
			browserObject.switchTo().frame(cn);
			
			browserObject.findElement(By.name("cardnumber")).sendKeys("7732 1231 1988 1211");
		
			browserObject.findElement(By.name("exp-date")).sendKeys("11/24");
			
			browserObject.findElement(By.name("cvc")).sendKeys("121");
		
			browserObject.findElement(By.xpath("//*[@id=\"payment-button\"]")).click();
		}
		@AfterTest
		public void closeDriver()
		{
			browserObject.close();
		}
}
