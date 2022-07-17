package sdet;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleLinks {

	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
			 String text=links.get(i).getAttribute("href");
			 
			 System.out.println(text);
			 
			 URL url=new URL(text);
				
				HttpURLConnection urllink=(HttpURLConnection)url.openConnection();
				urllink.connect();
				
				int count=0;
				if(urllink.getResponseCode()>400)
				{
					System.out.println("broken link");
					count++;
				}

				System.out.println(count);
			 
		}
		
		
	}

}
