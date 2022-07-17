package seleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
		 
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.get("https://www.goibibo.com/");
			driver.findElement(By.xpath("//p[contains(@class,'gr-cap-text gr-blue-text gr-bold')]")).click();
			
			//1.is displayed() method is used for all the elements

			boolean b1=driver.findElement(By.xpath("//input[contains(@type,'button')]")).isDisplayed();
			System.out.println(b1);//true
			
			//2.is enabled() method
			
			boolean b2=driver.findElement(By.xpath("//input[contains(@type,'button')]")).isEnabled();
			System.out.println(b2);//true
			
			//is selected() method is only applicable for radiobutton, checkbox, dropdown
			//boolean b3=driver.findElement(By.xpath("//body[contains(@class,'extraSeat-wrap modal-open')]")).isEnabled();
			//System.out.println(b3);
	}

}
