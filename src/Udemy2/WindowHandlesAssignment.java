package Udemy2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> windows=driver.getWindowHandles();  //[parendId,ChilId]
		Iterator<String> it=windows.iterator();
		String parendId=it.next();
		String ChilId=it.next();
		driver.switchTo().window(ChilId);
		System.out.println(driver.findElement(By.xpath("//div[@class='example']")).getText());
		driver.switchTo().window(parendId);
		System.out.println(driver.findElement(By.xpath("//div[@class='example']")).getText());
		

	}

}
