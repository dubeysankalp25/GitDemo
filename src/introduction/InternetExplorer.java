package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class InternetExplorer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.ie.driver", "D:\\Eclipse\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://msn.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
