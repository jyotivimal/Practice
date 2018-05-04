package Practice_Java.Practice_Java;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorExamples {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		JavascriptExecutor myExecutor = ((JavascriptExecutor) driver);
		myExecutor.executeScript("document.getElementById('lst-ib').setAttribute('value', 'Jyoti')");
		Thread.sleep(100);
		driver.quit();

		
		Robot objrobot = new Robot();
		objrobot.keyPress(KeyEvent.VK_ENTER);
		
		objrobot.mouseMove(450, 450);
		
		objrobot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
		
	}

}
