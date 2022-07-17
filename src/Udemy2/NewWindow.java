 package Udemy2;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/angularpractice");
		//click and open a new tab
		driver.switchTo().newWindow(WindowType.TAB);
		
		Set<String> s1=driver.getWindowHandles();
		Iterator<String>it=s1.iterator();
		String parentId=it.next();
		String childId=it.next();
		
		//access to child window
		driver.switchTo().window(childId);
		driver.get("https://www.rahulshettyacademy.com");
		
		String text=driver.findElement(By.xpath("//a[contains(text(),'All-Access Membership-Complete Access to 25+ Cours')]")).getText();
		
		driver.switchTo().window(parentId);
		WebElement name=driver.findElement(By.name("name"));
		name.sendKeys(text);
		
		//screenshot
		File file=name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("logo.png"));
		
		//get height and width
		
		System.out.println(name.getRect().getDimension().getWidth());
		
		System.out.println(name.getRect().getDimension().getHeight());
		
	}

}
