package sdet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class getTextvsGetAttribute {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//ChromeOptions ops=new ChromeOptions();
		//ops.addArguments("--disable-notifications");
		
		//WebDriver driver=new ChromeDriver(ops);
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		WebElement w1=driver.findElement(By.id("input-country"));
		
		Select s1=new Select(w1);
		
		s1.selectByIndex(2);
		
		s1.selectByValue("4");
		
		s1.selectByVisibleText("Algeria");
		
		List<WebElement> l1=s1.getOptions();
		
		for(int i=0;i<l1.size();i++)
		{
			if(l1.get(i).getText().equals(l1))
			l1.get(i).click();
			break;
		}
		
		
		

	}

}
