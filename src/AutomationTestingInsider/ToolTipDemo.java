package AutomationTestingInsider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.automationtestinginsider.com/p/selenium-vi.html");
		
		WebElement title=driver.findElement(By.name("q"));
		
		String tooltipText=title.getAttribute("title");
		
		System.out.println("Tooltip text"+tooltipText);
		
	}

}
