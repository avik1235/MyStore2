package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	
		
			//public static String browser="edge";
			public static WebDriver driver;
			
			public static void main(String[] args) {
				
					
				System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");	
			     driver=new ChromeDriver();
			     driver.get("https://developer.salesforce.com");
			     driver.get("https://developer.salesforce.com/signup");
			    //driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div/section[2]/div/sections-de-signup-form//form/dx-input[1]//div[1]/div/input")).sendKeys("Automation");
			    
			    // WebElement password=driver.findElement(By.id("password"));
			   //  driver.findElement(withTagName("input").
			     
			     //driver.findElement(By.name("user-name")).sendKeys("standard_user" );
			    // driver.findElement(By.className("form_input")).sendKeys("standard_user");
			     //driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
			     //driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user"));
			     //driver.findElement(By.xpath("//*[@id=\"input\"]")).sendKeys("avik");
			     
			     //driver.findElement(By.id("password")).sendKeys("secret_sauce" );

			     //driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/input")).click();
			    // driver.close();
			    

	}

}
