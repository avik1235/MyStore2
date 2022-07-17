package seleniumSessions;

import java.util.concurrent.TimeUnit;

import javax.swing.text.Document;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
		 
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.get("https://www.facebook.com/");
            driver.findElement(By.name("email")).sendKeys("8017188179");
            driver.findElement(By.name("pass")).sendKeys("avik303x1");
           WebElement loginb8n=driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
           flash(loginb8n,driver);//1.Falsh method
           drawBorder(loginb8n,driver);//2.draw border method
           
           //3.Take screenshot method
           //TakesScreenshot scrShot =((TakesScreenshot)driver);
           //java.io.File srcFile=scrShot.getScreenshotAs(OutputType.FILE);
          // FileUtils.copyFile(srcFile,"C:\\Users\\AVIK\\eclipse-workspace\\MyTestProject\\src\\seleniumSessions");
         
          //generateAlert(driver,"There is an isssue with login button");//4.generate alert
           
          // clikElementByJS(loginb8n,driver);//5.click on any element using JS executor
           
           driver.navigate().refresh();//6.....1.by using selenium
           refreshBrowserByJS(driver);//2.by using javascript
           System.out.println(gettitleByJS(driver));// 7.get the title of the page by JS
           System.out.println(getPageInnerText(driver));//get the inner Text
           ScrollPageDown(driver);
           WebElement forgotPwdLink=driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]"));
           
	}       
            public static void flash(WebElement element,WebDriver driver)
        	{
        		JavascriptExecutor js=(JavascriptExecutor)driver; 
        		String bgcolor = element.getCssValue("backgroundcolor");
        		//String bgcolor=element.getCssValue(propertyName)
        		for(int i=0; i<10; i++) {
        			changeColor("rgb(300,0,0)", element, driver);
        			changeColor(bgcolor, element, driver);	
        		}
        	}
        	public static void changeColor(String color,WebElement element,WebDriver driver )	{
        		JavascriptExecutor js=(JavascriptExecutor)driver; 
        		js.executeScript("arguments[0].style.backgroundColor = '"+color+"'", element);
        		
        		try {
        			Thread.sleep(300);
        			}
        		catch (InterruptedException e) {
        		}
	}

        	public static void drawBorder(WebElement element,WebDriver driver)
        	{
        		JavascriptExecutor js=(JavascriptExecutor)driver; 
        		js.executeScript("arguments[0].style.border='3px solid red'", element);
        	}
        	public static void generateAlert(WebDriver driver,String message)
        	{
        		JavascriptExecutor js=(JavascriptExecutor)driver;
        		js.executeScript("alert('"+message+"')");
        	}
        	public static void clikElementByJS(WebElement element,WebDriver driver)
        	{
        	JavascriptExecutor js=(JavascriptExecutor)driver; 
        	js.executeAsyncScript("arguments[0].click", element);
}
        	public static void refreshBrowserByJS(WebDriver driver)
        	{
        		JavascriptExecutor js=(JavascriptExecutor)driver; 
        		js.executeScript("history.go(0)");
        	}
        	
        	public static String gettitleByJS(WebDriver driver)
        	{
        		JavascriptExecutor js=(JavascriptExecutor)driver; 
        		String title= js.executeScript("return document.title;").toString();
        		return title;
        	}
        	
        	public  static String getPageInnerText(WebDriver driver)
        	{
        		JavascriptExecutor js=(JavascriptExecutor)driver; 
        		String title=js.executeScript("return document.documentElement.innerText").toString();
        		return title;
        	}
        	public static void ScrollPageDown(WebDriver driver)
        	{
        		JavascriptExecutor js=(JavascriptExecutor)driver; 
        		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        	}
        	public static void ScrollIntoView(WebElement element,WebDriver driver)
        	{
        		JavascriptExecutor js=(JavascriptExecutor)driver; 
        		js.executeScript("arguments[0].scrollIntoView(true)", element);
        	}
}
