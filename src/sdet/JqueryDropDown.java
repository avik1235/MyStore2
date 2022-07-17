package sdet;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class JqueryDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		WebElement drpCountry=driver.findElement(By.id("drpCountry"));
		drpCountry.click();
		selectChoicevalues(driver,"choice1","choice 12");
		selectChoicevalues(driver,"choice1");
		selectChoicevalues(driver,"all");
	}
	
	public static void selectChoicevalues(WebDriver driver,String...value)
	{
		List<WebElement> choiceList=driver.findElements(By.xpath("//span{@class='comboTreeItemTitle']"));
		if(!value[0].equals("all"))
		{
			for(WebElement item:choiceList)
			{
				String text=item.getText();
				
				for(String val:value)
				{
					if(text.equals(val))
					{
						item.click();
					}
				}
			}
		}
		else
		{
			for(WebElement item:choiceList)
			{
				item.click();
			}
		}
	}

}
