package seleniumSessions;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptExecutorconcept {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
	 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
          Actions action=new Actions(driver);
          
		action.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
		//driver.findElement(By.linkText("Your account")).click();
		//driver.findElement(By.linkText("Sign In")).click();

		//driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElement(By.name("email")).sendKeys("8017188179");
		//driver.findElement(By.name("pass")).sendKeys("avik303x");
		Thread.sleep(30000);
		driver.findElement(By.xpath("//*[@id=\"nav-al-your-account\"]/a[1]/span")).click();

	}

}
