package Practice_Java.Practice_Java;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Verify_SoftAssertions {

	@Test
	public void softAssertTest()
	{
		//create softAssert object
		SoftAssert softA = new SoftAssert();
		
		//Assertion failing
		softA.fail("Failing first assertion");
		System.out.println("Failing 1");

		softA.fail("Failing second assertion");
		System.out.println("Failing 2");
		
		softA.assertAll();
	}
}
	