package AutomationTestingInsider;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.automationtestinginsider.com/");
		  
		  Thread.sleep(2000);
		  
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  
		  
		  
		  js.executeScript("window.scrollBy(0,4000)");
		  
		  
		  
		  

	}

}
