
package seleniumSessions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class checkDropDownSorted {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
	
	       
	       driver.get("https://www.twoplugs.com/");
	       driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
	      WebElement drpEleement= driver.findElement(By.name("category_id"));
	      Select drpselect=new Select(drpEleement);
	      
	     List<WebElement>options= drpselect.getOptions();
	     
	     ArrayList originalist=new ArrayList();
	     ArrayList templist=new ArrayList();
	     
	     for(WebElement option:options)
	     {
	    	 originalist.add(option.getText());
	    	 templist.add(option.getText());
	     }
	     System.out.println("original list" +originalist);
	     System.out.println("temp list" +templist);
	     Collections.sort(templist);
	      
	     System.out.println("original list after sorting" +originalist);
	     System.out.println("temp list after sorting" +templist);
	     if(templist.equals(originalist))
	     {
	    	 System.out.println("sorted order");
	     }
	     else
	     {
	    	 System.out.println("unsorted order");
	     }
	}
	
	
}
