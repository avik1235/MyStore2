package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Flipkart {
	public static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");	
	     driver=new ChromeDriver();
	     driver.get("https://www.flipkart.com/");
	     driver.get("https://www.flipkart.com/viewcart?otracker=Cart_Icon_Click");

	}

}
