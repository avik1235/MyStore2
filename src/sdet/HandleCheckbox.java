 package sdet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckbox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		//1>select specific  checkbox
		
		driver.findElement(By.id("monday")).click();
		
		//2 select all the checkbox
		
		List<WebElement> checkbox=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		
		System.out.println("Total no of checkbox" +checkbox.size());
		
		
		//using for loop
		
		for(int i=1;i<checkbox.size();i++)
		{
			checkbox.get(i).click();
		}
		 
		//using for each loop
		
		for(WebElement chkbox:checkbox)
		{
			chkbox.click();
		}
		
		//3 select multiple check boxes by choices
		
		for(WebElement chkbox:checkbox)
		{
			String checkboxname=chkbox.getAttribute("id");
			if(checkboxname.contains("Monday") && checkboxname.contains("Sunday"))
			{
				chkbox.click();
			}
		}
		   
		//4 select last 2 check boxes 
		
		for(int i=checkbox.size()-2;i<checkbox.size();i++)
		{
			checkbox.get(i).click();
		}
		
		for(int i=0;i<checkbox.size();i++)
		{
			if(i<2)
			{
				checkbox.get(i).click();
			}
		}
		

	}

}
