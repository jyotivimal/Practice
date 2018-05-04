package Practice_Java.Practice_Java;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SwitchToFrame {
public static void main(String[] args) {
/*
	FirefoxOptions options = new FirefoxOptions();
	options.setBinary("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe"); //Location where Firefox is installed

	DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	capabilities.setCapability("moz:firefoxOptions", options);*/
	
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //navigates to the Browser
		
	    driver.get("http://demo.guru99.com/test/guru99home/"); 
	       // navigates to the page consisting an iframe

	       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	      /* driver.switchTo().frame("a077aa5e"); //switching the frame by ID

			System.out.println("********We are switch to the iframe*******");
     		driver.findElement(By.xpath("html/body/a/img")).click();
  		    //Clicks the iframe
       
  			System.out.println("*********We are done***************");*/
	       
	       //int size = driver.findElements(By.tagName("iframe")).size();
	   	
	   	/*for(int i=0; i<=size; i++){
	   	    driver.switchTo().frame(i);
	   	    int total=driver.findElements(By.xpath("html/body/a/img")).size();
	   		System.out.println(total);
	   	    driver.switchTo().defaultContent(); //switching back from the iframe
	   	 }*/
	   	            
	   		//Commented the code for finding the index of the element
	   	    driver.switchTo().frame(0); //Switching to the frame
	   		System.out.println("********We are switched to the iframe*******");
	   		driver.findElement(By.xpath("html/body/a/img")).click();
	   		
	   		//Clicking the element in line with Advertisement
	   	    System.out.println("*********We are done***************");
      }
}		