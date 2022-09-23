package seleniumPackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenAmazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe");
        ChromeDriver driver = new ChromeDriver();

        // pass url
        driver.get("http:www.amazon.com");
	}

}
