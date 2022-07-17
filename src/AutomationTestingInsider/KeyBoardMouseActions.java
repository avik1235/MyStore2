  package AutomationTestingInsider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardMouseActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		WebElement googleSearch=driver.findElement(By.name("q"));
		
		Actions a=new Actions(driver);
		
		a.keyDown(googleSearch, Keys.SHIFT)
		.sendKeys("selenium")
		.keyUp(googleSearch, Keys.SHIFT)
		.keyDown(googleSearch, Keys.CONTROL)
		.sendKeys("a")
		.keyDown(googleSearch, Keys.CONTROL)
		.sendKeys("x")
		.keyDown(googleSearch, Keys.CONTROL)
		.sendKeys("v")
		.build().perform();
		
		Thread.sleep(5000);
		driver.close();
		
		
		
		
	}

}
