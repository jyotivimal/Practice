package Practice_Java.Practice_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class chegg {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.chegg.com");
		
		WebElement textbox = driver.findElement(By.xpath(".//*[@id='autosuggest-input']"));
		textbox.sendKeys("Algebra");
		
		driver.findElement(By.xpath("//span[contains(text(),'Submit')]")).click();
		
		
		
		
		
		

	}

}
