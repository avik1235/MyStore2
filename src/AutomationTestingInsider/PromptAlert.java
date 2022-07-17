package AutomationTestingInsider;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		
        driver.findElement(By.name("promptAlert")).click();

        Alert alert=driver.switchTo().alert();
		 String text=alert.getText();
		 alert.sendKeys("Yes");
		 Thread.sleep(2000);
		 alert.accept();
		 
		 driver.close();
	}

}
