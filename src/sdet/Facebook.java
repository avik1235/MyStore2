package sdet;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.facebook.com/");
		
		String username="abc@com";
		String password="abc@12345";
		
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		WebElement status=driver.findElement(By.xpath("//div[@class='m9osqain a5q79mjw gy2v8mqq jm1wdb64 k4urcfbm qv66sw1b']/span[@class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7']"));
		
		Actions action=new Actions(driver);
		
		action.moveToElement(status).doubleClick().build().perform();
		   driver.findElement(By.xpath("//p[@class='i1ao9s8h hcukyx3x oygrvhab cxmmr5t8 kvgmc6g5']")).sendKeys("Hello World");
		     driver.findElement(By.xpath("//span[contains(text(),'Post')]")).click();
		
		
		
		

	}

}
