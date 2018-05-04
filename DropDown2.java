package Practice_Java.Practice_Java;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropDown2 {
public static void main(String[] args) throws InterruptedException, AWTException {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\jyoti.LENSKART0\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("http://demo.guru99.com/test/guru99home/");
	
	driver.findElement(By.xpath(".//*[@id='philadelphia-field-email']")).sendKeys("jyoti.vimal@gmail.com");
	String text = driver.findElement(By.xpath(".//*[@id='philadelphia-field-email']")).getAttribute("value");
	
	System.out.println(text);
	
	Select select = new Select(driver.findElement(By.xpath(".//*[@id='awf_field-91977689']")));
	select.selectByValue("sap-abap");
	Thread.sleep(5000);
	select.selectByVisibleText("SAP FICO");
	Thread.sleep(5000);
	
	driver.quit();
	}
}