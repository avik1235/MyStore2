package Udemy2;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String[] names = { "Cucumber", "Brocolli", "Cauliflower", "Beetroot" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
			
		addItems(driver, names);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();

			}

		
public static void addItems(WebDriver driver,String[] names)
{
int j = 0;
List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
for (int i = 0; i < products.size(); i++) {
	String[] name = products.get(i).getText().split("-");
	String formattedName = name[0].trim();
	// format it to get actual name
	// check where name you extracted is present in array or not
	// covert array into arraylist for easy search
	List itemsneededlist = Arrays.asList(names);
	
	if (itemsneededlist.contains(formattedName)) {
		j++;

		driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
		if(j==4)
		{
			break;
		}

	}
}
}
}