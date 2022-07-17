package Udemy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginpagePractise {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		@SuppressWarnings("deprecation")
		//WebDriverWait wait=new WebDriverWait(driver,5);
		//driver.get(null);
		//driver.findElement(By.name("username")).sendKeys("rahulshettyacademy");
        //driver.findElement(By.name("password")).sendKeys("learning");
       // driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
        //driver.findElement(By.xpath("//label[@class='customradio'][2]/input[@id='usertype']")).click();
        //Thread.sleep(5000);
        
        String s=driver.findElement(By.xpath("//div[@class='modal-body']")).getText();
        System.out.println(s);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
        driver.findElement(By.id("okayBtn")).click();
        
       WebElement staticdropdown= driver.findElement(By.xpath("//select[@class='form-control']"));
        
       Select dropdown=new Select(staticdropdown);
       
       dropdown.selectByIndex(2);
       
       driver.findElement(By.name("terms")).click();
       driver.findElement(By.name("signin")).click();
       Thread.sleep(5000);
       
       List<WebElement> products=driver.findElements(By.cssSelector(".card-footer .btn-info"));
       
       for(int i=0;i<products.size();i++)
       {
    	   products.get(i).click();
       }
       
      
	}

}
