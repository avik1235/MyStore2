package seleniumSessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		driver.get("");
		driver.findElement(By.xpath("//b[@class='caret'][1]")).click();
		List<WebElement> option=driver.findElements(By.xpath("//li[@class='open']/ul[@class='dropdown-menu']/li/a"));
		System.out.println(option.size());
		for(int i=0;i<option.size();i++)
		{
			if(option.get(i).getText().equalsIgnoreCase("Action"))
			{
				option.get(i).click();
			}
		}

	}

}
