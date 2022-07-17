package sdet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		WebElement drpCountry=driver.findElement(By.id("input-country"));
		Select s1=new Select(drpCountry);
		
		s1.selectByVisibleText("Iceland");
		
		s1.selectByIndex(4);
	s1.selectByValue("93");
	System.out.println(s1.getFirstSelectedOption().getText());
	
	List<WebElement> s2=s1.getOptions();
	for(WebElement option:s2)
	{
		if(option.getText().equals("Cuba"))
		{
			option.click();
			break;
		}
	}

	}

}
