package seleniumSessions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathGenius {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		       WebDriver driver=new ChromeDriver();
			 
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				

				driver.get("https://freecrm.com/");
				driver.findElement(By.linkText("LOG IN")).click();
				Thread.sleep(10000);
				driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sadhukhanavik1234@gmail.com");
				driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Avik@1234");

	}

}
