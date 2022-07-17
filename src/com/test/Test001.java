package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test001 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");//initiate the chromedriver.exe
		WebDriver driver = new ChromeDriver(); //to launch chrome browser
		
		driver.manage().window().maximize();//to maximize the browser window
		
		driver.get("https://www.selenium.dev/downloads/");//enter the url on the browser
		
		String pageTitle = driver.getTitle();//capture the page title
		int links = driver.findElements(By.tagName("a")).size();//get the available links on the page
		System.out.println("Availabale Links "+links);//print the count of links
		System.out.println("Page Title is "+pageTitle);//print the captured page title
		driver.findElement(By.xpath("//div[@id='main_navbar']//li//a//span[text()='Projects']")).click();//click on the project link
		Thread.sleep(10000);//hold execution for 10sec
		String text = driver.findElement(By.xpath("//p[contains(text(),'Selenium has')]")).getText();//capture the displayed text
		System.out.println("Text is "+text);//print the text
		driver.close();//close the browser
	}

}
