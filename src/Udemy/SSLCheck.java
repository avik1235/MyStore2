package Udemy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCheck {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		
		// 1...............................open blocked webite
		option.setAcceptInsecureCerts(true);
		
		
		//2..........................set and pass proxy
		Proxy proxy=new Proxy();
		proxy.setHttpProxy("ipaddress:4444");
		option.setCapability("proxy", proxy);
		
		//3.......................................block pop up windows
		option.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
		
		//4...............................set download directory
		
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "/directory/path");
        option.setExperimentalOption("prefs", prefs);
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://expired.badssl.com/");
		

	}

}
