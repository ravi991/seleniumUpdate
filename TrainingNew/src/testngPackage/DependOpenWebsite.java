package testngPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DependOpenWebsite {
	WebDriver driver;
    @Test
    public void openingAmazonSite() throws InterruptedException {
        System.out.println("Open amazon.com in chrome browser");
        driver.get("http://www.amazon.com/");
        Thread.sleep(2000);
    }
    @Test
    public void openingCNbcSite() throws InterruptedException {
        System.out.println("Open cnn.com in chrome browser");
        driver.get("http://www.cnbc.com/");
        Thread.sleep(2000);
    }
    @Test
    public void openingYahooSite() throws InterruptedException {
        System.out.println("Open yahoo.com in chrome browser");
        driver.get("http://www.yahoo.com/");
        Thread.sleep(2000);
    }
    @BeforeTest
    public void beforeTest() {
        // for running in Chrome, uncomment 2 following lines
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe");
        driver = new ChromeDriver();
//        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Administrator\\Documents\\drivers\\geckodriver.exe");
//        driver = new FirefoxDriver();
        System.out.println("beforeTest - Set System properties ; create object");
    }
    @AfterTest
    public void afterTest() {
        System.out.println("close the website");
        driver.close();
    }

}
