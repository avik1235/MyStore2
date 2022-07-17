package seleniumSessions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
		 
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			//driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
			

			driver.get("https://freecrm.com/");
			driver.findElement(By.linkText("Login")).click();
			//driver.switchTo().frame(1);
			driver.findElement(By.name("email")).sendKeys("sadhukhanavik1234@gmail.com");
			
			//driver.switchTo().frame(1);
			driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("Avik@1234");
			driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
			driver.switchTo().frame("mainpanel");
			Thread.sleep(20000);
			
			//*[@id="main-content"]/div/div[2]/div/table/tbody/tr[1]/td[2]/a
			//*[@id="main-content"]/div/div[2]/div/table/tbody/tr[2]/td[2]/a
			//*[@id="main-content"]/div/div[2]/div/table/tbody/tr[3]/td[2]/a
			//*[@id="main-content"]/div/div[2]/div/table/tbody/tr[4]/td[2]/a
			//method 1..................
			String beforexpath="//*[@id=\"main-content\"]/div/div[2]/div/table/tbody/tr[";
			String afterxpath="]/td[2]/a";
			for(int i=1;i<=4;i++)
			{
				String name=driver.findElement(By.xpath(beforexpath+i+afterxpath)).getText();
				System.out.print(name);
				if(name.contains("saikat sadhukhan"))
					{
					//*[@id="main-content"]/div/div[2]/div/table/tbody/tr[2]/td[2]/a
					driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/div/table/tbody/tr"+i+"]/td[2]/a")).click();
				}
			}
			
			//method 2...............
			driver.findElement(By.xpath("//a[contains(text(),'souvik sadhukhan')]//parent::td//preceding-sibling::td//input[@name='id']")).click();

	}
	
	 
}