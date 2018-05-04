package Practice_Java.Practice_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.demo.guru99.com/test/guru99home/");
		//driver.manage().window().maximize();
		JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("scroll(0, 2350)");
		
		driver.switchTo().frame("a077aa5e");
		
		System.out.println("********We are switching to the iframe*******");
 		driver.findElement(By.xpath("html/body/a/img")).click();
		    //Clicks the iframe
   		System.out.println("*********We are done***************");
   		
   		/*driver.switchTo().defaultContent();
   		driver.switchTo().parentFrame();*/
   		System.out.println("********We are switching to the main frame*******");
   			
   		//driver.close();

	}

}
