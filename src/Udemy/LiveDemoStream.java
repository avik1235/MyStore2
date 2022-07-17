package Udemy;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LiveDemoStream {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//capture all webElement into one list
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		//capture all webelement into one list
		
		List<WebElement>elementlist=driver.findElements(By.xpath("//tr/td[1]"));
		
		//capture text of all webelements into new(original) list
		List<String> originallist=elementlist.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//sort on the original list of step 3
		
		List<String> sortedlist=originallist.stream().sorted().collect(Collectors.toList());
		
		//sacan the nbame coloumn with getText->Beans->prints the price of the rice
		
		//originallist.stream().filter(s1 ->s1.getText().contains("Rice")).map(s1 -> getPriceVeggie(s1)).collect(Collectors.toList());
		
		

	}

}