package Udemy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTablePractise {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement count=driver.findElement(By.id("product"));
		
		//print the column count
		System.out.println(count.findElements(By.tagName("tr")).size());
		
	//prnt the row count
		System.out.println(count.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
		
		//print the 2nd row values
		List<WebElement>secondrow=driver.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		System.out.println(secondrow.get(0).getText());
		System.out.println(secondrow.get(1).getText());
		System.out.println(secondrow.get(2).getText());
	}

}
