package sdet;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import Udemy.TakeScreenshot;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		  
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		  driver.get("https://demo.nopcommerce.com/");
		  driver.manage().window().maximize();
		  
		File src=(File)((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
		
		File trg=new File("E:\\selenium workspace\\MyTestProject\\src\\sdet");
		
		FileUtils.copyFile(src, trg);
		
		
		
		//specific portion 
		
		WebElement a1=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
          
        File src1=a1.getScreenshotAs(OutputType.FILE);
		
		File trg1=new File("E:\\selenium workspace\\MyTestProject\\src\\sdet");
		
		FileUtils.copyFile(src1, trg1); 
		 
	}

}
