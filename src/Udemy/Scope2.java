package Udemy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//1.count of the link
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//2.count of the link footer
		
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));
		
        System.out.println(footerdriver.findElements(By.tagName("a")).size());
        
      //3.count of the link for perticular coloumn in footer
        
       WebElement coloundriver=driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
       System.out.print(coloundriver.findElements(By.tagName("a")).size());
       
     //4.click on the link and check the pages are opening
       for(int i=1;i<coloundriver.findElements(By.tagName("a")).size();i++)
    		   {
    	   
    	   String a=Keys.chord(Keys.SHIFT,Keys.ENTER);
    	   coloundriver.findElements(By.tagName("a")).get(i).sendKeys(a);
    	   
    	   Thread.sleep(2000);
    		   }
       
     //4.print title for each link
       Set<String> abc=driver.getWindowHandles();
       Iterator<String> it=abc.iterator();
       while(it.hasNext())
       {
      	driver.switchTo().window(it.next());
      	System.out.println(driver.getTitle());
       }
       
       
	}

}
