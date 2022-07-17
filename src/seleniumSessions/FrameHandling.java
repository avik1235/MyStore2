package seleniumSessions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		//dynamic wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	
		

			 
			driver.get("https://freecrm.com/");
			driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div/div/a/span[1]")).click();
			
			driver.findElement(By.name("email")).sendKeys("sadhukhanavik1234@gmail.com");
			driver.findElement(By.name("password")).sendKeys("Avik@1234");
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
	}

}
