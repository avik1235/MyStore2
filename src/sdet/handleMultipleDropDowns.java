package sdet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class handleMultipleDropDowns {
	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		 driver=new ChromeDriver();
		//ChromeOptions ops=new ChromeOptions();
		//ops.addArguments("--disable-notifications");
		
		//WebDriver driver=new ChromeDriver(ops);
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		//WebElement w1=driver.findElement(By.id("input-country"));
		
		WebElement text=driver.findElement(By.name("Country"));
		
		multipleWebElements(text,"Algeria");
		
	}
		public static void multipleWebElements(WebElement ele,String value)
		{
			Select s1=new Select(ele);
			List<WebElement> option=s1.getOptions();
			for(WebElement options:option)
			{
				if(options.getText().equals(value))
				{
					options.click();
				}
			}
			
			
		}
}

	
