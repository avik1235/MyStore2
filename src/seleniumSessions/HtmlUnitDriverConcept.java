package seleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HtmlUnitDriverConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless");
       WebDriver driver=new ChromeDriver(options);
	  //WebDriver driver=new HtmlUnitDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://freecrm.com/");
		System.out.println("Before Login the title is" +driver.getTitle());
		driver.findElement(By.linkText("LOG IN")).click();


		driver.findElement(By.name("email")).sendKeys("sadhukhanavik1234@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Avik@1234");

		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Log In")).click();

	}

}
