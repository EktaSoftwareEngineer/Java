package seleniumTrianing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LOginFacebook {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
	System.setProperty("webdriver.chrome.driver", "C:\\dev\\chromedriver_win32\\chromedriver.exe");
	System.out.println("[" + System.getProperty("webdriver.chrome.driver") + "]");
	WebDriver driver = new ChromeDriver();		
	driver.manage().window().maximize();
	driver.get("http://www.facebook.com");
	}
	@Test()
	public void facebook() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "facebook");
		
	}

}
