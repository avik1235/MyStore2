package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitconcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
		//WebDriver driver=new HtmlUnitDriver();
				
		driver.manage().window().maximize();
		Thread.sleep(20000);
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com/");
		
		driver.manage().window().maximize();//maximize window
		driver.manage().deleteAllCookies();//delete all cookies
		

		
	}

}
