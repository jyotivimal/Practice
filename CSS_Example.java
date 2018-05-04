package Practice_Java.Practice_Java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CSS_Example {
	
	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\jyoti.LENSKART0\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://only-testing-blog.blogspot.in/2014/05/login.html");
		
		WebElement text = driver.findElement(By.xpath("//div[@dir='ltr']//h1"));
		WebElement downloadlink = 
		driver.findElement(By.xpath("//div[@dir='ltr']//div[@dir='ltr']//a[contains(text(),'Download Text File')]"));
		
		//Read font-size property and print It In console.
		  String fontSize = text.getCssValue("font-size");
		  System.out.println("Font Size -> "+fontSize);
		  
		  //Read color property and print It In console.
		  String fontColor = text.getCssValue("color");
		  System.out.println("Font Color -> "+fontColor);
		  
		  //Read font-family property and print It In console.
		  String fontFamily = text.getCssValue("font-family");
		  System.out.println("Font Family -> "+fontFamily);
		  
		  String color = text.getCssValue("color");
		  System.out.println("style-> "+color);
		  
		  String[] hexValue = color.replace("rgba(", "").replace(")", "").split(",");

		  int hexValue1=Integer.parseInt(hexValue[0]);
		  hexValue[1] = hexValue[1].trim();
		  int hexValue2=Integer.parseInt(hexValue[1]);
		  hexValue[2] = hexValue[2].trim();
		  int hexValue3=Integer.parseInt(hexValue[2]);

		  String actualColor = String.format("#%02x%02x%02x", hexValue1, hexValue2, hexValue3);

		  Assert.assertEquals("#666666", actualColor);
		  System.out.println("*********************************************************************");
		  
		  //Read text-align property and print It In console.
		  String fonttxtAlign = downloadlink.getCssValue("text-align");
		  System.out.println("Font Text Alignment -> "+fonttxtAlign);
}
	
	
}
