package Udemy2;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {
	public static void main(String[] args) throws IOException 
	{

	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//broken url
	//step 1-Is to get all the url's tied up to the links using selenium
	//java methods will call URL'S and gets you the status code
	//if status code>400 then URL is not working->link which tied to URL is broken
	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	List<WebElement>links=driver.findElements(By.xpath("//li[@class='gf-li']/a"));
	int brokenlinks=0;

	for(WebElement link :links){
		String url=link.getAttribute("href");
		if(url==null || url.isEmpty())
		{
			System.out.println("url is empty");
			continue;
		}
		URL urllink = new URL(url);
		try {
			HttpURLConnection conn=(HttpURLConnection)urllink.openConnection();
			conn.connect();
			if(conn.getResponseCode()>=400)
			{
				System.out.println(conn.getResponseCode()+" is" +"broken link");
				brokenlinks++;
			}
			else
			{
				System.out.println(conn.getResponseCode()+" is" +"valid link");
			}
		} 
		catch (MalformedURLException e) {
		
			e.printStackTrace();
		}
		//System.out.println("total broken links is"+brokenlinks);
	

	}
	System.out.println("total broken links is"+brokenlinks);
}
}