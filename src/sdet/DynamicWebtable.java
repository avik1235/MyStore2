package sdet;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebtable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();
		
	WebElement user_name=driver.findElement(By.name("username"));
		user_name.clear();
		user_name.sendKeys("demo");
	WebElement password=driver.findElement(By.name("password"));
		password.clear();
		password.sendKeys("demo");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//sales
		
		driver.findElement(By.xpath("//a[normalize-space()='Sales']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Orders']")).click();
		
		//find the number of pages in the table
		
		String text=driver.findElement(By.xpath("//div[@class='col-sm-6 text-right']")).getText();
		System.out.println(text);
		
		int total_pages=Integer.valueOf(text.substring(text.indexOf("(")+1,text.indexOf("pages")-1));
		System.out.println(total_pages);
		
		for(int p=1;p<=total_pages;p++)
		{
			WebElement active_page=driver.findElement(By.xpath("//ul[@class='pagination']//li//span"));
			System.out.println("Active page"+active_page);
			active_page.click();
			
		}
		
		
		}
 
}
