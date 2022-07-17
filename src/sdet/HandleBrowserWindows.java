package sdet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleBrowserWindows {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.orangehrm.com/");
		Actions a1=new Actions(driver);
		
		//getWindowhandle
		
		String windowId=driver.getWindowHandle();
		
		System.out.println(windowId);
		
		//driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(3000);
		
		WebElement a2=driver.findElement(By.xpath("//a[@class='linkedin icon-youtube']"));
	   // a1.moveToElement(a2).keyDown(Keys.CONTROL).click().build().perform();
		
		Set<String> windowIds=driver.getWindowHandles();
		
		//1
		Iterator<String> it=windowIds.iterator();
		
		String parentId=it.next();
		String childId=it.next();
		
		driver.switchTo().window(childId);
		
		//second Method---using List/ArrayList
		
		List<String> windowIdList=new ArrayList(windowIds);
		
		String parentWindowId=windowIdList.get(0);
		String childWindowId=windowIdList.get(1);
		
		    //how to use window ID for switching
		
		driver.switchTo().window(childWindowId);
		
		System.out.print("child window title is"+driver.getTitle());
		
		//for each loop
		
		for(String winId:windowIdList)
		{
			String title=driver.switchTo().window(winId).getTitle();
			System.out.println(title);
		}
		driver.close();
		
		
		

	}

}
