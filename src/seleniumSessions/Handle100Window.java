package seleniumSessions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle100Window {
   static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
	        driver=new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8000));
	       driver.get("https://www.orangehrm.com/");
	       String parentWindowId=driver.getWindowHandle();
	       driver.findElement(By.xpath("//a[@class='linkedin icon-youtube']")).click();
	     driver.findElement(By.xpath("//a[@class='linkedin icon-linkedin2']")).click();
	       driver.findElement(By.xpath("//a[@class='twitter icon-twitter']")).click();
	       driver.findElement(By.xpath("//a[@class='facebook icon-facebook']")).click();
	       
	      Set<String> handles= driver.getWindowHandles();
	      List<String> hlist=new ArrayList<String>(handles);
	      if(switchToRightWindow("Facebook",hlist));
	      System.out.println(driver.getCurrentUrl()+" "+driver.getTitle());
	
	      
	switchToParentWindow(parentWindowId);
	closeAllWindows(hlist,parentWindowId);
	}
	
	
	public static void switchToParentWindow(String parentWindowId)
	{
		driver.switchTo().window(parentWindowId);
	}
	public static void closeAllWindows(List<String> hlist,String parentWindowId)
    {
    	for(String e:hlist)
    	{
    		if(!e.equals(parentWindowId))
    		{
    			driver.switchTo().window(e).close();
    		}
    	}
	
    }
	public static boolean switchToRightWindow(String windowTitle,List<String> hlist) {
		for(String e:hlist)
		{
			String title=driver.switchTo().window(e).getTitle();
			if(title.equals(windowTitle))
			{
				System.out.println("Found the right window");
				return true;
			}
		}
		return false;
		
	}

}
