package seleniumSessions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkTest {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
		 
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://freecrm.com/");
			driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
			Thread.sleep(10000);
			
			driver.findElement(By.name("email")).sendKeys("sadhukhanavik1234@gmail.com");
			driver.findElement(By.name("password")).sendKeys("Avik@1234");
			driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
			
			Thread.sleep(10000);
			List<WebElement> linkslist=driver.findElements(By.tagName("a"));
			
			linkslist.addAll(driver.findElements(By.tagName("img")));
			
			System.out.println("size of active links and images---->"+linkslist.size());

			
			List<WebElement> activelinks=new ArrayList<WebElement>();
			
			//iterate linklist:excluse all the links/image -doesnot have any href atrribute
			Thread.sleep(10000);
			for(int i=0;i<linkslist.size();i++)
			{
				
				if(linkslist.get(i).getAttribute("href")==null && (!linkslist.get(i).getAttribute("href").contains("javascript")))
				{
					
					activelinks.add(linkslist.get(i));
					
					
				}
			}
			
			//get the size of active links list
			
		System.out.println("size of active links and images---->"+activelinks.size());
		
		for(int j=0;j<activelinks.size();j++)
		{
			HttpURLConnection connection=(HttpURLConnection)new URL(activelinks.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String response=connection.getResponseMessage();
			connection.disconnect();
			
			System.out.println(activelinks.get(j).getAttribute("href")+"----"+response);
		}

	}

}
