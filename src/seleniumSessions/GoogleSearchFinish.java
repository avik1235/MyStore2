package seleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchFinish {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
		 
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			

			driver.get("https://www.google.com/");
			driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("testing");
			List<WebElement>list=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='eIPGRd']"));
			System.out.println("Total number of suggestion"+ list.size());
			
			for(int i=0;i<list.size();i++)
			{
				System.out.println(list.get(i).getText());
				if(list.get(i).getText().contains("testing in software engineering"))
				{
					list.get(i).click();
					break;
				}
			}

	}

}
