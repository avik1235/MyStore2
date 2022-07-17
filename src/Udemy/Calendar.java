package Udemy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.xpath(".//*[@id='travel_date']")).click();
		List<WebElement>dates=driver.findElements(By.className(".day"));
       int count=driver.findElements(By.className("day")).size();
       
       for(int i=0;i<count;i++)
       {
    	  String s= driver.findElements(By.className("day")).get(i).getText();
    	  System.out.println(s);
    	  if(s.equalsIgnoreCase("23"))
    	  {
    		  driver.findElements(By.className("day")).get(i).click();
    	  }
       }
	}

}
