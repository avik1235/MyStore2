package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RowColoumnCount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//Print the count no of row
		
		int rowcount=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
		System.out.println(rowcount);
		
		//Print the count no of coloumn
		
		int coloumcount=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th")).size();
		System.out.println(coloumcount);
		
		
		//retrive the 2nd row/coloumn data
		System.out.println(driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[2]/td[1]")).getText());
				
		//values in Each row of all coloumn
		
		//for(int i=)
		
		for (int r=1;r<=rowcount;r++)
		{
			for(int c=1;c<=coloumcount;c++)
			{
				String data=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[1]/td[1]")).getText();
				System.out.print(data+" ");
			}
			System.out.println();
		}
			
		for (int r=1;r<=rowcount;r++)
		{
			String firstrowcoloumn=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+r+"]/td[1]")).getText();
			if(firstrowcoloumn.equals("Ernst Handel	"))
			{
				String companyname=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+r+"]/td[1]")).getText();
				String contact=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+r+"]/td[2]")).getText();
			}
		}

	}

}
