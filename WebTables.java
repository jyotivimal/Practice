package Practice_Java.Practice_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		
		driver.get("http://toolsqa.com/automation-practice-table/");
		String sCellValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[2]")).getText();
		
		System.out.println(sCellValue);
		
		driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[2]/td[6]/a")).click();
		System.out.println("the link has been clicked");
		
		driver.close();

	}

}
