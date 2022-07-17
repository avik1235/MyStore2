package seleniumSessions;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//alerts--java script pop up---Alert API(accept,dismiss)
		//File upload pop up---Browse button(type=file,sendKeys(path))
		//Browser Window PopUp---AdvertisementPop up(windowhandeler API=getWindowHandles())
		
		driver.get("http://www.popuptest.com/goodpopups.text");
		
		driver.findElement(By.xpath("")).click();
	    Set<String> handler=driver.getWindowHandles();
	   Iterator it =(Iterator) handler.iterator();
	   
	  // String parentwindowid=it.next();
	   
	   System.out.print("parentwindowid");
	   
       // String childwindowid=it.next();
	   
	   System.out.print("childwindowid");
	   
	   driver.switchTo().window("childwindowid");
	   
	   System.out.print("child window title"+ driver.getTitle());
	   
	   driver.close();
	   
	   driver.switchTo().window("childwindowid");
	   
	   System.out.print("parent window title"+ driver.getTitle());
	}

}
