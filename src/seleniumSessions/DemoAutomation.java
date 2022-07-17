package seleniumSessions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoAutomation {

	public static void main(String[] args) {
		//For chrome Driver
		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		
		//For Firefox Driver
		//System.setProperty("webdriver.gecko.driver", "C:\\firefox driver\\geckodriver.exe");
		
		//For Edge Driver
		System.setProperty("webdriver.edge.driver", "C:\\edge driver\\msedgedriver.exe");
		
		//For Chrome
		//ChromeDriver driver=new ChromeDriver();
		
		//For firefox
		//FirefoxDriver driver=new FirefoxDriver();
		
		//For edge
		EdgeDriver driver=new EdgeDriver();
		
		
		
		driver.get("https://www.google.com/");

	}

}
