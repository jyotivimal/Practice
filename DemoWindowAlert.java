package Practice_Java.Practice_Java;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoWindowAlert {
	
	WebDriver driver;
	@BeforeClass
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.navigate().to("https://www.gmail.com");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test() throws Exception
	{
			  
		  driver.findElement(By.id("Email")).sendKeys("jyoti.vimal");
		  driver.findElement(By.id("next")).click();
		  
		  Thread.sleep(1000);
		  driver.findElement(By.id("Passwd")).sendKeys("Lifeisgood@26");
		  
		  Robot r=new Robot();
		  Thread.sleep(1000);
		     // Press Enter
		  r.keyPress(KeyEvent.VK_ENTER);
		  
		     
		     // Release Enter
		  r.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(20000);
	}
	
	@AfterClass
	public void tearDown()
		{
		driver.quit();
		}
	
	
}