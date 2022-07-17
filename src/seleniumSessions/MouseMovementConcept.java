package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	driver.get("https://www.ebay.com/");
	Actions action=new Actions(driver);
	action.moveToElement(driver.findElement(By.linkText("My eBay"))).build().perform();
	
	Thread.sleep(3000);
    driver.findElement(By.linkText("Summary")).click();
    
    driver.findElement(By.xpath("//p[@class='i1ao9s8h hcukyx3x oygrvhab cxmmr5t8 kvgmc6g5']")).sendKeys("hello world");
     driver.findElement(By.xpath("//span[contains(text(),'Post')]")).click();
    
	}

}
