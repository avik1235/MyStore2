package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);//switch to frame if its present
		
		Actions action=new Actions(driver);
		action.clickAndHold(driver.findElement(By.xpath("//*[@id=\"draggable\"]")))
		.moveToElement(driver.findElement(By.xpath("//*[@id=\"droppable\"]"))).release().build().perform();
		
		WebElement dropmsg=driver.findElement(By.xpath("//div/p[text()='Dropped!']"));
		
		if(dropmsg.isDisplayed())
		{
			System.out.println("Success");
			System.out.println("Message is"+dropmsg.getText());
		}
		else
		{
			System.err.println("Failed");
		}
		
		driver.switchTo().defaultContent();
		
	
		
		
	}

}
