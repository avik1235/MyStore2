package sdet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckDropDownSorted {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.twoplugs.com/");
		
		driver.findElement(By.linkText("LIVE POSTING")).click();
		
		WebElement dropdown=driver.findElement(By.name("category_id"));
		
		Select s1=new Select(dropdown);
		
		List<WebElement> options=s1.getOptions();
		
		ArrayList originallist=new ArrayList();
		ArrayList tempList=new ArrayList();
		
		for(WebElement option:options)
		{
			originallist.add(option.getText());
			tempList.add(option.getText());
		}
		Collections.sort(tempList);
		
		if(originallist.equals(tempList))
		{
			System.out.println("sorted list");
			
		}
		else
		{
			System.out.println("notsorted list");
		}
		

	}

}
