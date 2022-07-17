package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverBasic 
{

	public static void main(String[] args) 
	{
     //1 FF Browser
		//geckodriver
		System.setProperty("webdriver.gecko.driver","C:\\firefox driver\\geckodriver.exe");
		//WebDriver driver= new FirefoxDriver();//launch firefox browser
		//driver.get("http://www.google.com");
		
		//chrome driver
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();////launching chrome
	    driver.get("http://www.google.com");//enter url
	    
		String title=driver.getTitle();//return string
	    System.out.print(title);//getting title
	    //validation point
	    
	    if(title.equals("Google"))
	    {
	    	System.out.print("correct");
	    }
	    else {
	    	System.out.print("false");
	    }
	    System.out.print(driver.getCurrentUrl());//to get current url
	    System.out.print(driver.getPageSource());
	    driver.quit();//quit the browser
		}

}
