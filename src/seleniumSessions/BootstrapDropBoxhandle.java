package seleniumSessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BootstrapDropBoxhandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		//ChromeOptions options=new ChromeOptions();
		//options.addArguments("--headless");
	       WebDriver driver=new ChromeDriver();
		 
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://mdbootstrap.com/docs/b4/jquery/components/dropdowns/");
			driver.findElement(By.id("dropdownMenu1")).click();
			
			List<WebElement>list=driver.findElements(By.xpath("//div[contains(@class,'dropdown-primary')]//a"));
			System.out.println(list.size());
			
			for(int i=0;i<list.size();i++)
			{
				System.out.println(list.get(i).getText());
			}
			 
			

	}

}
