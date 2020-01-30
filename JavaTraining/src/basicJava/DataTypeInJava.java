package basicJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataTypeInJava {

	public static void main(String[] args) {
		
		
		String name= " Java";
		System.out.println("this is the first program in :" + name);
		
		System.setProperty("webdriver.chrome.driver", "C:\\dev\\chromedriver_win32\\chromedriver.exe");
		System.out.println("[" + System.getProperty("webdriver.chrome.driver") + "]");

		WebDriver driver = new ChromeDriver();
				
		driver.manage().window().maximize();

		driver.get("http://demo.guru99.com/test/ajax.html");

		// Find the radio button for “No” using its ID and click on it
		driver.findElement(By.id("no")).click();
			
		//Click on Check Button
		driver.findElement(By.id("buttoncheck")).click();
		
		driver.close();
		 int i= 10;
		 double d = 22.23;
		 char c= 'd';
		 boolean bad = true;
		 
		System.out.println(i );
		System.out.println(d);
		System.out.println(c);
		System.out.println(bad);

		}
		
		
	}


