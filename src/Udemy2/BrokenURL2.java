package Udemy2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenURL2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//broken url
		//step 1-Is to get all the url's tied up to the links using selenium
		//java methods will call URL'S and gets you the status code
		//if status code>400 then URL is not working->link which tied to URL is broken
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

	}

}
