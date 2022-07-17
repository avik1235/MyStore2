package Udemy2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCheck2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

		ChromeOptions ops=new ChromeOptions();
		ops.setAcceptInsecureCerts(true);
		WebDriver driver=new ChromeDriver(ops);
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
	}

}
