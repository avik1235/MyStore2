package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormFillupPractise {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Avik sadhukhan");
		driver.findElement(By.name("email")).sendKeys("sadhukhanavik@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Avik@1234");
		Thread.sleep(3000);
		driver.findElement(By.id("exampleCheck1")).click();
		Thread.sleep(3000);
		WebElement staticDropdown=driver.findElement(By.id("exampleFormControlSelect1"));
		
		Select dropdown=new Select(staticDropdown); 
		dropdown.selectByIndex(1);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		driver.findElement(By.name("inlineRadioOptions")).click();
		
		if(driver.findElement(By.name("inlineRadioOptions")).isEnabled())
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		driver.findElement(By.name("bday")).sendKeys("04032022");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//System.out.println(driver.findElement(By.id("inlineRadio3")).isEnabled());
		
		
	}

}
