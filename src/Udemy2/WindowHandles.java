package Udemy2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows=driver.getWindowHandles();  //[parendId,ChilId]
		Iterator<String> it=windows.iterator();
		String parendId=it.next();
		String ChilId=it.next();
		driver.switchTo().window(ChilId);
		
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		
		String email=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		System.out.println();
		driver.switchTo().window(parendId);
		driver.findElement(By.name("username")).sendKeys(email);
		
		
		//String[] s2=s1.split("@");
		//String s3=s2[1];
		//String[] s4=s3.split(" ");
		//String s5=s4[0];
		
		

	}

}
