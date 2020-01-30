package seleniumTrianing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenTheWebBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\dev\\chromedriver_win32\\chromedriver.exe");
		System.out.println("[" + System.getProperty("webdriver.chrome.driver") + "]");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		System.out.println("Well done");
		driver.close();
	}

}
