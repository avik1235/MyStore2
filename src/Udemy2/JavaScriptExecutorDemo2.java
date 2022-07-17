package Udemy2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JavaScriptExecutorDemo2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
	
		
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");
		List<WebElement>values=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum=0;
		
		for(int i=0;i<values.size();i++)
		{
			
			sum=sum+Integer.parseInt(values.get(i).getText());
		}
	String a1=driver.findElement(By.xpath("//div[contains(text(),' Total Amount Collected:')]")).getText();
		
		String a2=driver.findElement(By.xpath("//div[contains(text(),' Total Amount Collected:')]")).getText().split(":")[1].trim();
		System.out.println(a1);
		System.out.println(a2);
		int a3=Integer.parseInt(a2);
		Assert.assertEquals(a3, sum);
	}

}
