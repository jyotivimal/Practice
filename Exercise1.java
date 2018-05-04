package Practice_Java.Practice_Java;

import java.awt.AWTException;	
import java.awt.Robot;	
import java.awt.event.KeyEvent;	
import org.openqa.selenium.By;	
import org.openqa.selenium.WebDriver;	
import org.openqa.selenium.firefox.FirefoxDriver;	

public class Exercise1 {

	public static void main(String[] args) throws AWTException, InterruptedException {	
        WebDriver driver = new FirefoxDriver();	
        driver.get("http://spreadsheetpage.com/index.php/file/C35/P10/"); // sample url	
        driver.findElement(By.xpath(".//*[@id='content']/div/div[1]/ul[1]/li[3]/a")).click();	
        Robot robot = new Robot();  // Robot class throws AWT Exception	
        Thread.sleep(2000); // Thread.sleep throws InterruptedException	
        robot.keyPress(KeyEvent.VK_DOWN);  // press arrow down key of keyboard to navigate and select Save radio button	
        
        Thread.sleep(2000);  // sleep has only been used to showcase each event separately	
        robot.keyPress(KeyEvent.VK_TAB);	
        Thread.sleep(2000);	
        robot.keyPress(KeyEvent.VK_TAB);	
        Thread.sleep(2000);	
        robot.keyPress(KeyEvent.VK_TAB);	
        Thread.sleep(2000);	
        robot.keyPress(KeyEvent.VK_ENTER);	
    // press enter key of keyboard to perform above selected action	
  }	 
}
