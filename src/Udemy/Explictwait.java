package Udemy;

import java.util.Arrays;

import java.util.List;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;



public class Explictwait {



public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");



WebDriver driver=new ChromeDriver();

//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

@SuppressWarnings("deprecation")
//WebDriverWait w =new WebDriverWait(driver,5);



String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};





driver.get("https://rahulshettyacademy.com/seleniumPractise/");

Thread.sleep(3000);

addItems(driver,itemsNeeded);

driver.findElement(By.cssSelector("img[alt='Cart']")).click();

driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
 

driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");

driver.findElement(By.cssSelector("button.promoBtn")).click();

//explicit wait



//w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
//w.until(ExpectedConditions.
System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
}

private static void addItems(WebDriver driver, String[] itemsNeeded) {
	// TODO Auto-generated method stub
	
}
}

