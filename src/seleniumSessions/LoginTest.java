package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
    ChromeDriver driver=new ChromeDriver();
     driver.get("https://www.saucedemo.com/");
     driver.findElement(By.id("user-name")).sendKeys("standard_user" );
     driver.findElement(By.id("password")).sendKeys("secret_sauce" );

     driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/input")).click();
    // driver.close();
	}

}
