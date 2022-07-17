package AutomationTestingInsider;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) {
	
		

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		List<WebElement> options=driver.findElements(By.xpath("//ul[@jsname='bw4e9b']/li//span"));
		
		for(WebElement option:options)
		{
			if(option.getText().equalsIgnoreCase("selenium webdriver"))
			{
				option.click();
			}
		}
		

	}

}
