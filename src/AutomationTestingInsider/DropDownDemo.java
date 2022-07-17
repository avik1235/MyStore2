package AutomationTestingInsider;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	

		public static WebDriver driver;
		
		public  void launchBrowser() throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

        driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");

        Thread.sleep(2000);

	}
		
		public void DropDownDemo() {
			WebElement bday=driver.findElement(By.id("Birthday_Day"));
			WebElement bMonth=driver.findElement(By.id("Birthday_Month"));
			WebElement bYear=driver.findElement(By.id("Birthday_Year"));
			Select selectDay=new Select(bday);
			Select selectMonth=new Select(bMonth);
			Select selectYear=new Select(bYear);
			
			selectDay.selectByIndex(4);
			selectMonth.selectByValue("March");
			selectYear.selectByValue("2022");
			
			String text=selectDay.getFirstSelectedOption().getText();
			System.out.println(text);
			
			List<WebElement> monthList=selectMonth.getAllSelectedOptions();
			
			System.out.println("total Months"+monthList.size());
			
			for(WebElement ele:monthList)
			{
				System.out.println(ele.getText());
			}
			
			
			
			
		}
		
		public static void main(String[] args) throws InterruptedException {
			
			DropDownDemo obj=new DropDownDemo();
			obj.launchBrowser();
			obj.DropDownDemo();
		}

}
