package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginTest2 {
	public static String browser="edge";
	public static WebDriver driver;
	
	public static void main(String[] args) {
		/*if(browser.equals("chrome"))
		{
			
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");	
	     driver=new ChromeDriver();
	     }
		else if(browser.equals("firefox"))
		{
		System.setProperty("webdriver.gecko.driver", "C:\\\\firefox driver\\\\geckodriver.exe");	
	      driver=new ChromeDriver();
	     }	
	     */
		 if(browser.equals("edge"))
		{
		System.setProperty("webdriver.edge.driver", "C:\\\\edge driver\\\\msedgedriver.exe");	
	      driver=new EdgeDriver();
	      }	
	
		driver.get("https://www.saucedemo.com/");
	     driver.findElement(By.id("user-name")).sendKeys("standard_user" );
	     driver.findElement(By.id("password")).sendKeys("secret_sauce" );

	    driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/input")).click();
	    // driver.close();
	}

}
