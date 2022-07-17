package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StatcDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
           driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
               driver.findElement(By.xpath("//a[@value='BLR']")).click();
                  Thread.sleep(4000);
                  driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
                  
                  System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
                  System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
                  driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
                  System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
                  System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
                  if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
                  {
                	  System.out.println("is enabled");
                	  
                  }
                  else
                  {
                	  System.out.println("not enabled");
                  }
		//driver.findElement(by)
		//driver.findElement(By.xpath("a[@class='ui-state-default ui-state-highlight ui-state-active']")).click();
		
/*WebElement staticDropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	Select dropdown=new Select(staticDropdown);
	dropdown.selectByIndex(3);;
	System.out.println(dropdown.getFirstSelectedOption().getText());
	dropdown.selectByVisibleText("AED");
	System.out.println(dropdown.getFirstSelectedOption().getText());
	dropdown.selectByValue("INR");
	System.out.println(dropdown.getFirstSelectedOption().getText());*/
	}

}
