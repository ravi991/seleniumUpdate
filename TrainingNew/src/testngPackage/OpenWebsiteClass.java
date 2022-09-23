package testngPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenWebsiteClass {
	WebDriver browserObject;
	@Test
   	 public void openingAmazonSite() throws InterruptedException {
     
		browserObject.get("http://www.amazon.com/");
	// 5. Thread.sleep is used to hold the part of code for given time limit. In this case take mouse over the thread and add Interrupted exception to this method
        Thread.sleep(2000);
      
    }
   // 7. In next method to set the dependency use dependOMethods and pass the method name depended to.
    @Test
    public void openingCNBCSite() throws InterruptedException {
	
    	browserObject.get("https://www.cnbc.com/");
	// 5. Thread.sleep is used to hold the part of code for given time limit. In this case take mouse over the thread and add Interrupted exception to this method
        Thread.sleep(2000);
	 // 6. close the browser
       
    }
    // 8. In next method to set the dependency use dependsOnMethods and pass the method name depend to.
    @Test
    public void openingYahooSite() throws InterruptedException {
      
	 // 4. Open the web page http://www.yahoo.com/ in first test case
        System.out.println("Open /close  yahoo.com in chrome browser");
        browserObject.get("http://www.yahoo.com/");
	 // 5. Thread.sleep is used to hold the part of code for given time limit. In this case take mouse over the thread and add Interrupted exception to this method
        Thread.sleep(2000);
	 // 6. close the browser
       
    }
    @BeforeTest
    public void beforeTest() {
        System.out.println("--@beforeTest, set the browser, maximise the window");
	// 2. setup the property of chromedriver because we will perform testing of login process through chrome web browser.
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe");
        browserObject = new ChromeDriver();
	// 3. Initialize Webdriver object through ChromeDriver class.
        browserObject.manage().window().maximize();
    }
	// 14. @AfterTest is used to excute the test case after the test is exceuted
    @AfterTest
    public void afterTest() {
        System.out.println("--@afterTest, closing the browser window");
	// 15. Close the web browser.   
        browserObject.close();
    }
}
