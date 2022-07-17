package Udemy;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("//input[@id='dob']")).click();
		
		//select the month from dropdown
		WebElement month=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		
		Select select=new Select(month);
		select.selectByVisibleText("Oct");
		
		//select the date from dropdown
		
		WebElement year=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select select1=new Select(year);
		select1.selectByVisibleText("2021");
		
		//date selection
		
		String date="15";
	    List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
	    for(WebElement dates:alldates)
	    {
	    	String dt=dates.getText();
	    	if(dt.equals(date))
	    	{
	    		dates.click();
	    		break;
	    	}
	    }
		

	}

}
