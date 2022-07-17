package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsdemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Actions a=new Actions(driver);
		
		//WebElement element=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		WebElement element=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		a.moveToElement(element).contextClick().build().perform(); 
		
		

	}

}
