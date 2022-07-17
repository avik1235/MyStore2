package sdet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BooStrapgenericMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		ChromeOptions ops=new ChromeOptions();
		ops.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(ops);
		driver.get("https://www.hdfcbank.com/");
		driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();
    List<WebElement>options=driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']//li"));
		
		System.out.println(options.size());
		selectOptionFromDropdown(options,"Accounts");

	}

	
	public static void selectOptionFromDropdown(List<WebElement>option1,String value)
	{
		for(WebElement option:option1)
		{
			if(option.getText().equals(value))
					{
				     option.click();
				     break;
					}
		}
		
	}
}
