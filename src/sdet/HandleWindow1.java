package sdet;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindow1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.in/2017/07/multiple-window-examples.html");
		String parent=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[contains(@href,'http//www.google.com')]")).click();
		Set<String> allwindows=driver.getWindowHandles();
		int count=allwindows.size();
		System.out.println(count);
		
		for(String child:allwindows)
		{
			if(!parent.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);
				driver.findElement(By.name("q")).sendKeys("Selenium Webdriver");
				Thread.sleep(3000);
				driver.close();
			}
		}
		
		
	}

}
