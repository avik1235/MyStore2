package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxPractise {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption1")).click();
	       System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
	   	driver.findElement(By.id("checkBoxOption1")).click();
	   	System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
	   	
	   int number=driver.findElements(By.xpath("//input[@type='checkbox']")).size();
	   System.out.println(number);

	}

}
