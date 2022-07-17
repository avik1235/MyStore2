package seleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 
		driver.get("https://www.ebay.com/");
		
		//absolute xpath:not recommonded
		///html/body/header/table/tbody/tr/td[3]/form/table/tbody/tr/td[1]/div[1]/div/input[1]
		
		//1.Performance issue
		//2.not reliable
		//3 can be changed anytime in future
		
		//driver.findElement(By.xpath("//input[@aria-autocomplete='list']")).sendKeys("java");
		//driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("java");
		
		//driver.findElement(By.xpath("//input[contains(@name,'_nkw')]")).sendKeys("java");
		
		//dynamic id:input
		//id=test_123
		//by.id("test_123")
		
		//starts-with
		//id=test_456
		//id=test_789
		//id=test_test_7890_test
		
		//ends-with
		//id=1234_test
		//id=5789_test
		//id=23456_test
		
		//driver.findElement(By.xpath("//input[contains(@id,'test_')]")).sendKeys("Test");
		//driver.findElement(By.xpath("//input[starts-with(@id,'test_')]")).sendKeys("Test");
		//driver.findElement(By.xpath("//input[ends-with(@id,'_test')]")).sendKeys("Test");
		//all the links are represented by <a> html tag
		driver.findElement(By.xpath("//a[contains(text(),'My eBay')]")).click();
		
		
	}

}
