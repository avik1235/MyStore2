package AutomationTestingInsider;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		
        driver.findElement(By.name("confirmationAlert")).click();
        
       if(isAlertPresent(driver))
       {
    	   System.out.println("Alert is present");
       }
       else
       {
    	   System.out.println("Alert is not present");
       }
        

	}
	
	public static boolean isAlertPresent(WebDriver ldriver)
	{
		 try {
			Alert alert=ldriver.switchTo().alert();
			 String text=alert.getText();
			 alert.accept();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return false;
	}
	
}