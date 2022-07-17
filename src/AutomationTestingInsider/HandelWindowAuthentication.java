package AutomationTestingInsider;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelWindowAuthentication {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://the-internet.herokuapp.com/basic_auth");
		  Thread.sleep(2000);
		  Runtime.getRuntime().exec("C:\\Users\\Hitendra\\Desktop\\Authen.exe");
		  Thread.sleep(2000);
		        //driver.close()
	}

}
