package Udemy;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LiveExamplePractise {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//1.click the checkbox
		driver.findElement(By.id("checkBoxOption2")).click();
		String s=driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText();
		System.out.println(s);
		
		//2.select the dropdown by fetching the value from dropdown
		WebElement a1=driver.findElement(By.id("dropdown-class-example"));
		Select select=new Select(a1);
		select.selectByVisibleText(s);
		
		//3.put the value from check box and click and then fetch the value from alert and find the dropdown value is presnet or not 
		driver.findElement(By.name("enter-name")).sendKeys(s);
		driver.findElement(By.id("alertbtn")).click();
		
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		
		if(alert.getText().contains(s))
		{
			System.out.println(s);
		}
	   alert.accept();

	}

}
