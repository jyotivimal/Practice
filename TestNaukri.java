package Practice_Java.Practice_Java;

import org.testng.annotations.Test;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
 
public class TestNaukri {
 
@Test
public void TestPopUp() throws InterruptedException{
// Open browser
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(); //navigates to the Browser

	driver.get("http://www.naukri.com/");
	String parent = driver.getWindowHandle();
	
	Set<String> windows = driver.getWindowHandles();
	Iterator<String> itr = windows.iterator();

	while (itr.hasNext())
	{
		String child_window = itr.next();
		
		if(!parent.equals(child_window))
		{
			driver.switchTo().window(child_window);
			System.out.println(driver.switchTo().window(child_window).getTitle());
			driver.close();
		}
	}
	
	driver.switchTo().window(parent);
	
	WebElement button = driver.findElement(By.xpath(".//img[@src='https://static.naukimg.com/s/4/100/i/naukri_Logo.png']"));
	button.click();
	/*
	Point pos = driver.manage().window().getPosition();
	int x= pos.getX();
	int y= pos.getY();
	
	System.out.println(x+y); */
	
	
}
}