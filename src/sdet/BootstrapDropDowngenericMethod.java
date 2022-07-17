package sdet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class BootstrapDropDowngenericMethod {
	
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		ChromeOptions ops=new ChromeOptions();
		ops.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(ops);
		driver.get("https://www.hdfcbank.com/");
		
		driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();
		List<WebElement>options=driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']//li"));
		selectOptionFromDropDSownOptions(options,"Cards");
		
		
		
	}

	
	public static void selectOptionFromDropDSownOptions(List<WebElement> options,String value)
	{
       
		System.out.println(options.size());
		for(WebElement option:options)
		{
			if(option.getText().equals(value))
					{
				     option.click();
				     break;
					}
		}
	}
	
}


