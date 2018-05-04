package Practice_Java.Practice_Java;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
public class DropDownCommands {
public static void main(String[] args) throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\jyoti.LENSKART0\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
	
	Select oSelect = new Select(driver.findElement(By.id("continents"))); //dropdown
	
	oSelect.selectByIndex(1);
	oSelect.selectByVisibleText("Antartica");;
	
	
	WebElement listbox = driver.findElement(By.xpath(".//*[@id='selenium_commands']")); //listbox
	
	Select objselect = new Select(listbox);
	
	objselect.selectByIndex(0);
	objselect.selectByIndex(1);
	objselect.selectByVisibleText("Wait Commands");
	objselect.selectByVisibleText("Switch Commands");
	
	objselect.deselectAll();
	
	/*********************************************************************************************************************************/
	WebElement radiobtn = driver.findElement(By.xpath(".//*[@id='sex-0']")); //radiobutton
	
	radiobtn.click();

	boolean bvalue;
	
	bvalue = radiobtn.isSelected();
	
	if(bvalue = false)
	{
		System.out.println("Person is female");
	}
	
	else
	{
		System.out.println("Person is male");
	}
	
	WebElement radiobtn1 = driver.findElement(By.xpath(".//*[@id='sex-1']"));
	
	radiobtn1.click();
	
	String sval = radiobtn.getAttribute("value");
	System.out.println(sval);
	boolean bval = radiobtn.isSelected();
	
	System.out.println(bval);
	
	/*********************************************************************************************************************************/
	
	WebElement objcheckbox = driver.findElement(By.xpath(".//*[@id='profession-0']")); //checkbox
	
	objcheckbox.click();
	
	// Step 4:) Select option 'Europe' (Use selectByIndex)
	oSelect.selectByVisibleText("Europe"); //dropdown
	
	Thread.sleep(5000);
	
	oSelect.selectByVisibleText("Antartica");

	// Using sleep command so that changes can be noticed
	Thread.sleep(2000);

	// Step 5: Select option 'Africa' now (Use selectByVisibleText)
	oSelect.selectByIndex(2);
	Thread.sleep(2000);

	// Step 6: Print all the options for the selected drop down and select one option of your choice
	// Get the size of the Select element
	List<WebElement> oSize = oSelect.getOptions();
	int iListSize = oSize.size();
	
	driver.findElement(By.partialLinkText("Link Test")).click();

	driver.findElement(By.linkText("Link Test")).click();
		
	String currentURL = driver.getCurrentUrl();
	Assert.assertEquals(currentURL,"http://toolsqa.com/automation-practice-table/","string not equal");
	
	System.out.println("Title of page is "+driver.getTitle());
	
	
/*	// Setting up the loop to print all the options
	for(int i =0; i < iListSize ; i++){
		// Storing the value of the option	
		String sValue = oSelect.getOptions().get(i).getText();
		// Printing the stored value
		System.out.println(sValue);
		// Putting a check on each option that if any of the option is equal to 'Africa" then select it 
		if(sValue.equals("Africa")){
			oSelect.selectByIndex(i);
			break;
			}
		}	    */
	driver.quit();
	}
}