package seleniumTrianing;

import org.testng.annotations.Test;
import org.testng.annotations.*;

public class TestNG {
	/*
	 * installation from URl http:// beust.com/eclipse/
	 * 
	 HTML Report
	 Diff (annotation)
	 priority
	 dependencies 
	 grouping 
	 data provider
	 testng open source, free - is unit testing frame work 
	 JAR files
	  
	 @BeforeClass :always associate with the method Prerequite
	 @AfterClass: 
	 @Before Method: 
	 @BeforeSuite: SetUp Method
	 
	 
	 
 	set up system property for chrome
 	login Method
 	lunch chrome browser
 	enterURl
	this is first test
 	logout up system property for chrome
 	close the browser chrome
 	deleteallcookies

	  */
	
	// Pre- Condition annotation with @beore
	@BeforeSuite// first preference 
	public void setUp() {
		System.out.println(" set up system property for chrome");
	}
	@BeforeTest
	public void login() {
		System.out.println(" login Method before Test");
	}
	
	@BeforeClass// second preference
	public void lunchBrowser() {
		System.out.println(" lunch chrome browser class");
	}
	@BeforeMethod
	public void enterUrl() {
		System.out.println(" enterURl  Before method");
	}
	
	@Test(priority =2, groups ="Testing")//6
	public static void FirstTest(){
		System.out.println("this is first test");
	}
	@Test(priority =3, groups= "Title")//7
	public static void TitleTest(){
		System.out.println("this is Title, group test");
	}
	@Test(priority =1)//5
	public static void SecondTest(){
		System.out.println("this is Second test");
	}
	//Post Conditions --- Starting with @After
	
	/*@BeforeMethod 
	 * @test
	 * @AfterMethod
	 * 
	 * */
	// @Before Suite-- SetUp system Property for chrome--1
	//@Before Test -- launchBrowser --II
	// @Before Class-- login to app--III
	
	
	// @BeforeMethod -- enter url 
	// @Test -- Search test
	//@AfterMethod -- logout from App
	
	// @BeforeClass -- close Browser
	//@AfterClass -- deleteAllCookies
	
	
	@AfterMethod// 6
	public void logourt() {
		System.out.println(" logout up system property for  After chrome");
	}
	@AfterTest//8
	public void deleteAllCookies() {
		System.out.println("  deleteallcookies After Test");
	}
	@AfterClass//7
	public void closeBrowser() {
		System.out.println(" close the browser chrome After class ");
	}
	@AfterSuite
	public void generateTestReport() {
		System.out.println("generate test Report After Suite");
	}

}
