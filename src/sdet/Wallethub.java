package sdet;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Wallethub {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

		String username="abc@com";
		String password="abc@1234";
		String feedback="it is very good, I am very satisfied with the service get here, It is highly recommended to choose the health insurance from walllethub company and it is also pocket friendly for medium earner people.";
		
		;
		driver.get("https://wallethub.com/join/light");
		driver.findElement(By.name("em")).sendKeys(username);
		driver.findElement(By.id("pw1-ipt")).sendKeys(password);
		driver.findElement(By.id("pw2-ipt")).sendKeys(password);
		driver.findElement(By.id("get-my-report")).click();
          driver.findElement(By.xpath("//span[contains(text(),'Join')]")).click();
          
		
          driver.navigate().to("https://wallethub.com/profile/test-insurance-company-13732055i");
          Actions action=new Actions(driver);
          action.moveToElement(driver.findElement(By.xpath("//review-star[@class='rvs-svg']//div[@class='rating-box-wrapper']//*[name()='svg'][4]/*[name()='g'][1]/*[name()='path'][1]"))).click().build().perform();
      driver.findElement(By.xpath("//ng-dropdown[@class='wrev-drp']")).click();
        List<WebElement> dropdown=driver.findElements(By.xpath("//ng-dropdown[@class='wrev-drp']//ul[@role='listbox']//li"));
       
        System.out.println("number of oprtions"+dropdown.size());
        for(WebElement type:dropdown)
        {
        	if(type.getText().equalsIgnoreCase("Health Insurance"))
        		type.click();
        }
          
     driver.findElement(By.xpath("//textarea[@class='textarea wrev-user-input validate']")).sendKeys(feedback);
          driver.findElement(By.xpath("//div[@class='sbn-action semi-bold-font btn fixed-w-c tall']")).click();
          
          driver.navigate().to("https://wallethub.com/profile/");
         
          
          
	}

}
