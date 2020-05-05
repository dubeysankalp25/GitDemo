package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(3000);
	    
		//driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		//driver.findElement(By.cssSelector("//input[@name ='ctl00$mainContent$view_date1']")).click();
		
		
		/*
	    driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
	    Thread.sleep(3000);
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
	    s.selectByValue("3");
	    */
	}

}
