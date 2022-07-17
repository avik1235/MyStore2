package Udemy2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		WebElement web=driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"));
		
		Select s1=new Select(web);
		s1.selectByIndex(1);
		System.out.println(s1.getFirstSelectedOption().getText());
		s1.selectByValue("AED");
		System.out.println(s1.getFirstSelectedOption().getText());
		s1.selectByVisibleText("INR");
		System.out.println(s1.getFirstSelectedOption().getText());
	}

}
