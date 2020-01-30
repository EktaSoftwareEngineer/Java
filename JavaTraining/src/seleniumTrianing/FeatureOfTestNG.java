package seleniumTrianing;

import org.testng.annotations.Test;
/**?
 * Priority
 * dependsOnMethonds
 * Multiple times invocationcount 
 * @author Ekta Kumar
 *
 */
public class FeatureOfTestNG {
	@Test(invocationCount=5)
	public void TestLogin() {
		System.out.println("Testing if it logins or not");
		//int j= 20/0;
	}

	@Test(dependsOnMethods ="TestLogin")
	public void TestHomePage() {
		System.out.println("Testing if it HOmepage is Displayed or not");
	}
	@Test(dependsOnMethods ="TestLogin")
	public void TestingLocation() {
		System.out.println("Testing if it location is displayed or not");
	}
}
