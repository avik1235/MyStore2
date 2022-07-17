package sdet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleMultipleDropdown {

	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/?");
		
		WebElement country=driver.findElement(By.name("Country"));
		dropdown(country,"Albania");
		
		//Select s1=new Select(dropdown);
		
		//s1.selectByVisibleText("Albania"); 
		
	}
		public static void dropdown(WebElement ele,String value)
		{
			Select drp=new Select(ele);

			List<WebElement> s2=drp.getOptions();
			for(WebElement option:s2)
			{
				if(option.getText().equals(value))
				{
					option.click();
					break;
				}
			}
		}
		

	}


