package AutomationTestingInsider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php?redirect_to=https%3A%2F%2Fs1.demo.opensourcecms.com%2Fwordpress%2Fwp-admin%2F&reauth=1");
		Thread.sleep(2000);
		
		Actions a1=new Actions(driver);
		
		driver.findElement(By.id("user_login")).sendKeys("opensourcecms");
		  driver.findElement(By.id("user_pass")).sendKeys("opensourcecms");
		  driver.findElement(By.id("wp-submit")).click();
		  
		
		  Thread.sleep(3000);
		 a1.moveToElement(driver.findElement(By.xpath("//a[text()='Howdy, ']"))).build().perform();
		  Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[@class='ab-item'][text()='Log Out']")).click();
		  Thread.sleep(3000);
		 driver.close();
		  

	}

}
