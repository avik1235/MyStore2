.0package sdet;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		  
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		  driver.get("https://text-compare.com");
		  driver.manage().window().maximize();
		  
		
		  
		 WebElement input1= driver.findElement(By.name("text1"));
		 input1.sendKeys("Avik");
		  
		  
			 WebElement input2= driver.findElement(By.name("text2"));
			 
			  Actions act=new Actions(driver);
			 
			 act.keyDown(Keys.CONTROL);
			 act.sendKeys("a");
			 act.keyUp(Keys.CONTROL);
			 act.build().perform();
			 
			 act.keyDown(Keys.CONTROL);
			 act.sendKeys("c");
			 act.keyUp(Keys.CONTROL);
			 act.build().perform();
			 
			 act.keyDown(Keys.TAB);
			 act.build().perform();
			 
			 
			 act.keyDown(Keys.CONTROL);
			 act.sendKeys("v");
			 act.keyUp(Keys.CONTROL);
			 act.build().perform();

	}

}
