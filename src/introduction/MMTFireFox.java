package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MMTFireFox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:\\Eclipse\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://spicejet.com");
		driver.findElement(By.className("select_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        driver.findElement(By.id("divpaxinfo")).click();
	    Thread.sleep(3000);
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
	    s.selectByValue("3");
	    Thread.sleep(3000);
	    //driver.findElement(By.xpath("//select[@id = 'ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency']")).click();
	    //Select Currency = new Select(driver.findElement(By.xpath("//select[@id = 'ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency']")));
	    //Currency.selectByVisibleText("AED");
	   //driver.findElement(By.xpath("//input[@type ='submit']")).click();
	     driver.findElement(By.cssSelector("#ControlGroupSearchView_AvailabilitySearchInputSearchView_ButtonSubmit")).click();
	    
	  //input[@type ='submit']
	    
	
	}

}
