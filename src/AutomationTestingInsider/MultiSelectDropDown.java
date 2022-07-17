package AutomationTestingInsider;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {
	
	public static WebDriver driver;
	
	public  void launchBrowser() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

    driver = new ChromeDriver();

    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

    driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");

    Thread.sleep(2000);

}
	
	public void DropDownDemo() throws InterruptedException {
		 WebElement multiSelectList = driver.findElement(By.id("multi-select"));



         Select selectCity = new Select(multiSelectList);



         selectCity.selectByIndex(0); // 4

         Thread.sleep(1000);

         selectCity.selectByValue("Florida");

         // selectCity.deselectByValue("Florida");

         // selectCity.deselectByValue("Florida");

         // selectMonth.selectByValue("January");

         Thread.sleep(1000);
         
         List<String> expectedList = new ArrayList<>();

         expectedList.add("California");

         expectedList.add("New Jersey");

         expectedList.add("Florida");



         List<String> actualList = new ArrayList<>();



         List<WebElement> allSelectedoptions = selectCity.getAllSelectedOptions();
         
         for (WebElement ele : allSelectedoptions) {

             actualList.add(ele.getText());

             System.out.println(ele.getText());
      }



         Collections.sort(expectedList);

         Collections.sort(actualList);

         boolean result = actualList.equals(expectedList);

         System.out.println("The result of Comparison is:" + result);


		
	}
	
	 public void tearDown() {

         driver.close();

    }

	public static void main(String[] args) throws InterruptedException {

		MultiSelectDropDown obj = new MultiSelectDropDown();

        obj.launchBrowser();

        obj.DropDownDemo();

        obj.tearDown();
	}

}
