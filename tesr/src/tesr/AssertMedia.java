package tesr;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssertMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
        // for running in Chrome, uncomment 2 following lines
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.itlearn360.com/");
        System.out.println(driver.getTitle()+"website");
        
        List <String> websiteLinks = Arrays.asList("facebook","twitter","instagram","youtube","linkedin");
        for (String website :websiteLinks)
        {
        	WebElement icon= driver.findElement(By.xpath("//ul[@class='header-social-icons']//a[contains(@href,'"+website+"')]"));
        	icon.click();
        	System.out.println(driver.getTitle()+"website");
        	driver.navigate().back();
        }

	}

}
