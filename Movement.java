package Practice_Java.Practice_Java;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Movement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("http://newtours.demoaut.com/");
		
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
		
		Select objselect = new Select(driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[12]/td[2]/select")));
		
		objselect.selectByVisibleText("ANTARCTICA");
		
		Thread.sleep(5000);
		
		objselect.selectByValue("92");
		
		Thread.sleep(5000);
		
		objselect.selectByIndex(7);
		
		Thread.sleep(5000);
		
		
		List<WebElement> objlist = objselect.getOptions();
		int sizeoflist = objlist.size();
		
		System.out.println(sizeoflist);
		
		
		
		WebElement firstOption = objselect.getFirstSelectedOption();
		
			System.out.println("first option selected "+firstOption.getText());
		
		
		Thread.sleep(5000);
		
		List<WebElement> allSelectedOptions = objselect.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions)
		{
			System.out.println("You have selected::"+ webElement.getText()); //because this is not multi select tag
		}
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
