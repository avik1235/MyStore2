package AutomationTestingInsider;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownByVisibility {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		  
		  Thread.sleep(2000);
		  
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  
		  WebElement ele=driver.findElement(By.id("simplealert"));
		  
		  js.executeScript("arguments[0].scrollIntoView()",ele );
		  
	}

}
