package Practice_Java.Practice_Java;

import org.testng.Assert;
import org.testng.annotations.Test;
 
public class AssertionsTest {
 
 @Test
 public void testMultiply() 
 {
System.out.println("Before Error");
try{
	Assert.assertEquals(50, multiply(10, 5));
	Assert.assertTrue(1+2==3);
	
	System.out.println("Passing 1");
	
	Assert.fail("Failing second assertion");
	System.out.println("Failing 2");
	}
catch(Throwable t)
{
	 System.out.println("in catch block, catching the exception");	
}
 
 }
 
 public int multiply(int x, int y) {
 return x * y;
 }
 
 
 
}