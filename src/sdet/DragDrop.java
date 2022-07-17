package sdet;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		  
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		  driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		  driver.manage().window().maximize();
		  
		  driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		  
		 WebElement src= driver.findElement(By.xpath("//li[1]"));
		 WebElement target= driver.findElement(By.id("trash"));
		  Actions act=new Actions(driver);
		  
		  act.dragAndDrop(src, target).build().perform();

	}

}
