package seleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
		 
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			

			driver.get("https://www.facebook.com/");
			driver.findElement(By.partialLinkText("Create")).click();

			//is selected() method is only applicable for radiobutton, checkbox, dropdown
			driver.findElement(By.xpath("//label[contains(@class,'_58mt')]")).click();
			boolean b3=driver.findElement(By.xpath("//label[contains(@class,'_58mt')]")).isSelected();
			System.out.println(b3);

			driver.findElement(By.xpath("//label[contains(@class,'_58mt')]")).click();
			boolean b4=driver.findElement(By.xpath("//label[contains(@class,'_58mt')]")).isSelected();
			System.out.println(b4);
	}

}
