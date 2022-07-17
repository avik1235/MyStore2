package seleniumSessions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessChromeTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		ChromeOptions ops=new ChromeOptions();
		ops.addArguments("--headless");
		
       WebDriver driver=new ChromeDriver(ops);
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://freecrm.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		Thread.sleep(10000);
		
		driver.findElement(By.name("email")).sendKeys("sadhukhanavik1234@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Avik@1234");
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();


	}

}
