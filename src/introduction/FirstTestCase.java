package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
    System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://google.com");
	System.out.println(driver.getTitle());
	//System.out.println(driver.getCurrentUrl());
	driver.get("http://yahoo.com");
	driver.navigate().back();
	driver.close();
	}	

}
