package Udemy;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

import org.testng.asserts.SoftAssert;

public class BrokenURL {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//broken url
		//step 1-Is to get all the url's tied up to the links using selenium
		//java methods will call URL'S and gets you the status code
		//if status code>400 then URL is not working->link which tied to URL is broken
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		List<WebElement>links=driver.findElements(By.xpath("//li[@class='gf-li']/a"));
		int brokenlinks=0;

		//SoftAssert a =new SoftAssert();

		for(WebElement link :links){
			String url=link.getAttribute("href");
			URL urllink=new URL(url);
			HttpURLConnection conn= (HttpURLConnection)urllink.openConnection();
			//conn.setRequestMethod("HEAD");
			conn.connect();
			
			if(conn.getResponseCode()>=400)
			{
				System.out.println(conn.getResponseCode()+" is" +"broken link");
				brokenlinks++;
			}
			//count++;
			//System.out.println("total broken links"+ count);
			//a.assertTrue(respcode<400, "The link with Text"+link.getText()+" is broken with code" +respcode);
		}
		
		
		System.out.println("total broken links"+ brokenlinks);
	
	}

}
