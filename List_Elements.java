package Practice_Java.Practice_Java;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class List_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.guru99.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> list= driver.findElements(By.xpath(".//*[@class='featured-box']"));
		
		System.out.println(Integer.toString(list.size()));
		
		for(WebElement webel:list)
		{
			System.out.println(webel.getTagName()+":"+webel.getText());
		}
		
		List<WebElement> list2=driver.findElements(By.xpath(".//*[@class='rt-grid-12 rt-alpha rt-omega']"));
		
		for(WebElement webel2: list2)
		{
			System.out.println(webel2.getTagName()+""+webel2.getText());
		}
		
		driver.navigate().to("http://www.google.co.in");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.quit();
		
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		String thelinktext = driver.findElement(By.partialLinkText("egis")).getText();
		
		System.out.println(thelinktext);

		thelinktext = driver.findElement(By.partialLinkText("EGIS")).getText();
		//the "By.partialLinkText()" method will access these two links separately depending on the capitalization of the characters.
		
		System.out.println(thelinktext);
		
		driver.quit();
		
	}

}
