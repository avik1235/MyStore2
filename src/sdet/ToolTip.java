package sdet;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		  
		  Actions act=new Actions(driver);
		  
		  act.sendKeys(Keys.ENTER).perform();
		  act.sendKeys(Keys.BACK_SPACE).perform();
		  
		  Thread.sleep(2000);
		  
		  act.sendKeys(Keys.ESCAPE).perform();
		  
		  act.sendKeys(Keys.SPACE).perform();

	}

}
