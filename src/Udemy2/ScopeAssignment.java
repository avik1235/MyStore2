package Udemy2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ScopeAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption2")).click();
		String text=driver.findElement(By.xpath("//label[@for='benz']")).getText();
		System.out.println(text);
		WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
		Select select=new Select(dropdown);
		select.selectByVisibleText(text);
		
		driver.findElement(By.name("enter-name")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();
	String alerttext=driver.switchTo().alert().getText();
		System.out.println(alerttext);
		
		if(alerttext.contains(text))
		{
			System.out.println(true);
		}
		else{
			System.out.println(false);
		}

	}

}
