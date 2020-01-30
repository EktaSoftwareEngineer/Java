



import org.testng.annotations.Parameters;

import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

 

public class checkTest2 {

WebDriver driver;

@Parameters({"browse","URL"})

@Test

public void launchBrowser(String browse,String URL) {

switch(browse) {

 

case "chrome":

System.setProperty("webdriver.chrome.driver","C:\\Users\\Intellipaat-Team\\Downloads\\driver\\chromedriver.exe");

driver = new ChromeDriver();

break;

 

case "firefox":

System.setProperty("webdriver.gecko.driver","C:\\Users\\Intellipaat-Team\\Downloads\\driver\\geckodriver.exe");

driver = new FirefoxDriver();

break;

 

case "IE":

System.setProperty("webdriver.ie.driver","C:\\Users\\Intellipaat-Team\\Downloads\\driver\\iexploredriver.exe");

driver = new InternetExplorerDriver();

break;

}

driver.get(URL);

System.out.println(URL);

}}


