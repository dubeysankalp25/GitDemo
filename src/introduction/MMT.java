package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MMT {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
	    WebElement source = driver.findElement(By.cssSelector("input[type ='text']"));
	    source.clear();
	    source.sendKeys("MUM");
	    Thread.sleep(3000);
	    source.sendKeys(Keys.ENTER);

	}

}
