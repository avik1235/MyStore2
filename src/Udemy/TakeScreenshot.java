package Udemy;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		
		//File src=((TakeScreenshot) driver).getScreenshotAs(OutputType.FILE);

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
	     FileUtils.copyFile(src, new File("D:\\java1\\creenshot.png"));
	}

}
