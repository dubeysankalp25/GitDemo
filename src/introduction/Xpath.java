package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://rediff.com");
	    driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
	    driver.findElement(By.xpath("//input[@id ='login1']")).sendKeys("Userrname");
	    driver.findElement(By.cssSelector("input#password")).sendKeys("Password");
	    driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();
	}

}
