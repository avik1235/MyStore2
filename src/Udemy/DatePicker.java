package Udemy;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		String year="2023";
		String month="July";
		String date="10";
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		while(true)
		{
			String monthyear=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			String arr[]=monthyear.split(" ");
			String mon=arr[0];
			String yr=arr[1];
			if(mon.equalsIgnoreCase(month) & yr.equals(year))
				break;
			else
			driver.findElement(By.xpath("//button[normalize-space()='>']")).click();
		}
		
		//date selection
		List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
		 for(WebElement ele:alldates)
		 {
			 String dt=ele.getText();
			 if(dt.equals(date))
			 {
				 ele.click();
				 break;
			 }
		 }
	}

}
