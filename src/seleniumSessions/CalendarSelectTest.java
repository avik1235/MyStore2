package seleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalendarSelectTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		//dynamic wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	
		

			 
			driver.get("https://freecrm.com/");
			driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
			Thread.sleep(10000);
			
			driver.findElement(By.name("email")).sendKeys("sadhukhanavik1234@gmail.com");
			driver.findElement(By.name("password")).sendKeys("Avik@1234");
			driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
			driver.findElement(By.linkText("Calendar")).click();
			String date="01-February-2022";
			String date1[]=date.split("-");//{01,April,2021}
			
			String day=date1[0];
			String month=date1[1];
			String year=date1[2];
			
			//Select select=new select();
			
			String beforeXpath="//*[@id=\"main-content\"]/div/div[2]/div/div[2]/div/div[2]/div[";
			String afterXpath="]/div[2]/div/div[";
			
			final int totalweekdays=7;
			for(int rownum=2;rownum<=6;rownum++) {
				for (int colnum=1;colnum<=totalweekdays;colnum++)
				{
					String dayval=driver.findElement(By.xpath("beforexpath+rownum+afterXpath+colnum+[")).getText();
					System.out.println(dayval);
					
				}
			}
			
	}

}
