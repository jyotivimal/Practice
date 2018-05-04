package Practice_Java.Practice_Java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BP_Series5 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jyoti.LENSKART0\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Actions action = new Actions(driver);	

	/*	driver.get("http://www.google.co.in/");
		driver.findElement(By.xpath(".//input[@name='q']")).sendKeys("Lenskart");
		driver.findElement(By.xpath(".//input[@value='Google Search']")).click();
		
		Actions act = new Actions(driver);
		WebElement toElement = driver.findElement(By.xpath("//a[@href='http://www.lenskart.com/'][contains(text(),'Lenskart.com® - First Eyeglasses Frame FREE')]"));
		
		//mouse hover & click
		act.moveToElement(toElement).click(toElement).build().perform();
		act.sendKeys(Keys.chord(Keys.CONTROL,"t")).perform();*/
		
		driver.get("http://only-testing-blog.blogspot.in/2014/09/selectable.html");
		WebElement elementToBeDoubleClicked = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		
		/*JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,2450)", "");*/
		
		Thread.sleep(3000);
			
		action.doubleClick(elementToBeDoubleClicked).perform();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(3000);
		alert.dismiss();
		
		
	}

}
