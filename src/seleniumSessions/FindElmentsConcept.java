package seleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElmentsConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 
		driver.get("https://www.ebay.com/");
		
		//get the count of links on the page
		//get the text of each link on the page
		//all the links are represented by <a> html tag v
		List <WebElement> linklist=driver.findElements(By.tagName("a"));
		
		//size of linklist
		
		System.out.println(linklist.size());
		
		for(int i=0;i<linklist.size();i++)
		{
			String s=linklist.get(i).getText();//----------------------to get all the text in link
			System.out.print(s);
		}
	
	}

}
