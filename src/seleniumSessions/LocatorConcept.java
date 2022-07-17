package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();////launching chrome
	    driver.get("https://www.facebook.com/");//enter url
	    
	    //1.xpath:-----------2nd prefernce
	    //absolute xpath should not be used
	    //only relative xpath should be used
	    driver.findElement(By.xpath("//*[@id='firstname]")).sendKeys("Avik");
	    
	    //2 name:------------3rd prefernce
	    driver.findElement(By.name("firstname")).sendKeys("avik");
	    driver.findElement(By.name("firstname")).sendKeys("sadhukhan");	
	    
	   // id--------if id is avilable then it is 1st prefernce
	    
	    driver.findElement(By.id("firstname")).sendKeys("avik");
	    driver.findElement(By.id("firstname")).sendKeys("sadhukhan");	
	    
	    //linktext---------this is only for links
	    
	    driver.findElement(By.linkText("Sign in")).click();
	    
	    //partial linkText: not useful
	    driver.findElement(By.partialLinkText("Already have")).click();
	    
	    //CSS selector--------2
	    //if id is there then write #{id}
	    // if class is there then write .{class}
	    driver.findElement(By.cssSelector("#address")).sendKeys("12 new street");
	    
	    //class:not recommonded------4
	    
	    driver.findElement(By.className("8esn")).click();
	    }

}
