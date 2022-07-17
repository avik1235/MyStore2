package Udemy2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablesAssignment {

	

		public static void main(String[] args)  {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			js.executeScript("window.scrollBy(0,500)");
			
			//count the no of row
			System.out.println(driver.findElements(By.xpath("//table[@name='courses']/tbody/tr")).size());
			
			//count the no of coloumn
			WebElement count=driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[1]"));
			
			int totalcount=count.findElements(By.tagName("th")).size();
			
		     System.out.println(totalcount);
			
		List<WebElement> secondrow=driver.findElements(By.xpath("//table[@name='courses']/tbody/tr")).get(2).findElements(By.tagName("td"));
			
		System.out.println(secondrow.get(0).getText());
        System.out.println(secondrow.get(1).getText());
        System.out.println(secondrow.get(2).getText());

	}

}
