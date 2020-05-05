package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\Eclipse\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		/*driver.findElement(By.id("email")).sendKeys("Mine email address");
		driver.findElement(By.name("pass")).sendKeys("1234");
		driver.findElement(By.linkText("Forgotten account?")).click();
		//System.out.println(driver.getTitle());
		driver.quit();*/
		driver.findElement(By.cssSelector("#email")).sendKeys("dubeysankalp25@gmail.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("@indravilla20");
		driver.findElement(By.xpath("//input[@value ='Log In']")).click();
	
	}
	
}
