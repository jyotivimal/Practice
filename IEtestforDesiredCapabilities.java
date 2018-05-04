package Practice_Java.Practice_Java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IEtestforDesiredCapabilities {
  
 public static void main(String[] args) {


//it is used to define IE capability
	 DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
   
capabilities.setCapability(CapabilityType.BROWSER_NAME, "IE");
capabilities.setCapability(InternetExplorerDriver.
  INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);


/*String name= capabilities.getBrowserName();
System.out.println(name);

//System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");

 WebDriver driver = new InternetExplorerDriver(capabilities);
  
 driver.manage().window().maximize();

 driver.get("http://gmail.com");
  
 driver.quit();*/
 }
  
}