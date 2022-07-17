package AutomationTestingInsider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handelWindowAuthentication2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
