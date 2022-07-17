package Udemy2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import  static org.openqa.selenium.support.locators.RelativeLocator.*;

import org.openqa.selenium.By;


public class RelativeLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/angularpractice");

		//1.above 
		WebElement nameEditBox=driver.findElement(By.name("name"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
		
		//2 to left of
        WebElement loveicecream=driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
		
		driver.findElement(with(By.tagName("input")).toLeftOf(loveicecream)).click();
		
		//3 below
		WebElement dateofbirth=driver.findElement(By.xpath("//label[@for='dateofBirth']"));
		
		driver.findElement(with(By.tagName("input")).below(dateofbirth)).click();
		
		//torightof
		 WebElement radiobutton=driver.findElement(By.name("inlineRadioOptions"));
		 
		 System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(radiobutton)).getText());
	}
	

}
