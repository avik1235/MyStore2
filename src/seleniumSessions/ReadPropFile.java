package seleniumSessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropFile {

	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		Properties prop=new Properties();
		FileInputStream ip=new FileInputStream("C:\\Users\\AVIK\\eclipse-workspace\\MyTestProject\\src\\seleniumSessions\\config.properties");
		prop.load(ip);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		
	    String url=prop.getProperty("URL");
		System.out.println(url);
	    String browsername=prop.getProperty("browser");
	    System.out.println(browsername);
	    
	    System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
	
		driver.get(url);
		
		driver.findElement(By.xpath(prop.getProperty("phonenumb_xpath"))).sendKeys(prop.getProperty("phonenumb"));
		driver.findElement(By.xpath(prop.getProperty("password_xpath"))).sendKeys(prop.getProperty("password"));
	}

	
}
