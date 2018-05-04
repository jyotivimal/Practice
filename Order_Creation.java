/**
 * 
 */
package Practice_Java.Practice_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.Assertion;

/**
 * @author Jyoti
 *
 */
public class Order_Creation {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.lenskart.com");
		driver.manage().window().maximize();
		
		//pop up closed
		////a[@class='popup-close hidden-phone lenskart-sign-close']
		driver.findElement(By.xpath(".//*[@id='login-pop-up']/div[1]/a")).click();
		
		//click on mens 
			
		WebElement parentelement = driver.findElement(By.cssSelector(".first-level-2"));
		WebElement clickelement = driver.findElement(By.xpath(".//*[@id='level1-Men']/li[3]/a/span"));
		
		Actions action = new Actions(driver);  
		
		action.moveToElement(parentelement).perform();
		Thread.sleep(2000);
		action.click(clickelement).perform();
				
	    //driver.findElement(By.xpath(".//*[@id='level1-Men']//span[contains(text(),'Sunglasses') and not(contains(text(),'Power'))]")).click();
		//driver.findElement(By.xpath(".//*[@id='level1-Men']/li[3]/a"));
		
		//view range click on vincent chase sunglasses
		driver.findElement(By.xpath(".//*[@id='mainpagecontainer']/div/div/section[1]/center/div/a/div")).click();
			
		//image for sunglass
		
		driver.findElement(By.xpath(".//*[@id='productimgover112901']")).click();
		
		String text_prod=driver.findElement(By.xpath(".//*[@id='mainpagecontainer']/div/div[1]/ul/li[5]")).getText();
		
		//add to cart
		driver.findElement(By.xpath(".//*[@id='alone_add_button']")).click();
		
		String text_cart=driver.findElement(By.xpath(".//*[@id='slideShoppingCart']/div[2]/div[1]/div/div/div/div[1]/div[1]")).getText();
		Thread.sleep(20000);
		
		//proceed to checkout
		driver.findElement(By.xpath(".//*[@id='slideShoppingCart']/div[1]/a")).click();
		
		//popup to add 2 frames(BOGO)
		driver.findElement(By.xpath("//.//*[@id='56ebe2ae8964d30c00eb5c66']/a")).click();
		
		
		
		System.out.println(text_cart);
		System.out.println(text_prod);
		
		driver.close();
		
		
	}

}
