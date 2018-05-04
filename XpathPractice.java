package Practice_Java.Practice_Java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class XpathPractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jyoti.LENSKART0\\Downloads\\chromedriver.exe");
		//System.setProperty("webdriver.ie.driver","C:\\Users\\jyoti.LENSKART0\\Downloads\\IEDriverServer.exe");
		WebDriver driver = new ChromeDriver();
	//	WebDriver driv = new InternetExplorerDriver();
		driver.manage().window().maximize();		
		driver.get("http://www.gmail.com/");
		//driv.get("http://www.gmail.com/");
		
		/*driver.findElement(By.xpath("(//*[starts-with(@id,'iden')])[1]"));
		
		driver.findElement(By.xpath("(//*[contains(@id,'iden')])[1]"));
		
		driver.findElement(By.xpath("//*[text()='Not your computer? Use Guest mode to sign in privately. ']"));
		
		//  (//input[@type='text'])[last()] - to find out last textbox in page.
		
		// (//input[@type='text'])[1] - - to find out first textbox in page. (//input[@type='text'])[last()-1]
		
		driver.findElement(By.xpath("//*[@id='FirstName']/following::input"));
	*/
		driver.findElement(By.cssSelector("input[name='identifier']")).sendKeys("jyoti.vimal@gmail.com");
		// input[name^=identi]    input[name$=ifier] 	input[name*=ide]
		// starts with				end with				contains
		
		
		
	
	}

}
