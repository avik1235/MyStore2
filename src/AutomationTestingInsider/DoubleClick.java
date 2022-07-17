package AutomationTestingInsider;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		driver.manage().window().maximize();
		
		WebElement a=driver.findElement(By.id("doubleClickBtn"));
		Actions a1=new Actions(driver);
		
         a1.moveToElement(a).doubleClick().build().perform();
         

         
         Alert alert=driver.switchTo().alert();
         alert.getText();
         alert.accept();
         
         
  		WebElement a2=driver.findElement(By.id("rightClickBtn"));
        
        a1.moveToElement(a2).contextClick().build().perform();

	}

}
