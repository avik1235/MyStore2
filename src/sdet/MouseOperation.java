package sdet;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		  
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		  driver.get("http://swisnl.github.io/jQuery-contextMenu/");
		  driver.manage().window().maximize();
		  
		 WebElement a1= driver.findElement(By.xpath("//img[@alt='context menu rendered by $.contextMenu']"));
		  
		  Actions act=new Actions(driver);
		  
		  act.moveToElement(a1).contextClick().build().perform();
		  
		  //act.contextClick(act).build().perform();
		  
		  act.moveToElement(a1).doubleClick().build().perform();
		  
		  

	}

}
