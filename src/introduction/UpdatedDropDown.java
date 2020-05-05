package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// via xpath 
		driver.get("http://spicejet.com");
		
		System.out.println(driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		//driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).click();
		System.out.println(driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		//via Css Selector
		//driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
	    
		
		//driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		
	    //driver.findElement(By.xpath("//a[@value='BHO']")).click();
	    
	    //Thread.sleep(3000);
	    //driver.findElement(By.xpath("//a[@value='STV']")).click();
	    
	}

}
