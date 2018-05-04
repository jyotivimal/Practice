package Practice_Java.Practice_Java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragDropExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jyoti.LENSKART0\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		WebElement From1 = driver.findElement(By.xpath("//*[@id='g-container-main']//li[2]/a[1]"));  //li[@id='credit']
		// //*[@id='g-container-main']//li[2]/a[1]
		// /html[1]/body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]
		
		WebElement To1 = driver.findElement(By.xpath("//ol[@id='amt7']"));
		
		Actions builder = new Actions(driver);
		builder.dragAndDrop(From1, To1);
		/*Action dragAndDrop1 = builder.clickAndHold(From1).moveToElement(To1).release(To1).build();
		dragAndDrop1.perform();
		*/
		Thread.sleep(10);
		
		WebElement From2 = driver.findElement(By.xpath("//*[@id='g-container-main']//li[4]/a[1]"));
		WebElement To2 = driver.findElement(By.xpath("//ol[@id='amt8']"));
		
		Action dragAndDrop2 = builder.clickAndHold(From2).moveToElement(To2).release(To2).build();
		dragAndDrop2.perform();
		Thread.sleep(10);
		
		WebElement From3 = driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
		WebElement To3 = driver.findElement(By.xpath("//ol[@id='bank']"));
		
		Action dragAndDrop3 = builder.clickAndHold(From3).moveToElement(To3).release(To3).build();
		dragAndDrop3.perform();
		Thread.sleep(10);
		
		WebElement From4 = driver.findElement(By.xpath("//a[contains(text(),'SALES')]"));
		WebElement To4 = driver.findElement(By.xpath("//ol[@id='loan']"));
		
		Action dragAndDrop4 = builder.clickAndHold(From4).moveToElement(To4).release(To4).build();
		dragAndDrop4.perform();
		Thread.sleep(10);
		
		/*WebDriverWait wait = new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Perfect!')]")));
		*/
		
		boolean waitelement = driver.findElement(By.xpath("//a[contains(text(),'Perfect!')]")).isDisplayed();
		if(waitelement == true)
		{
			System.out.println("element visible");
		}
		else
		{
			System.out.println("element not visible");
		}
		//driver.quit();
		}

}
