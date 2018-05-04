import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FirstTest{
 

 private static Actions selenium;
 
 public static void main(String args[]) throws InterruptedException{
  
  WebDriver driver;
  
  driver = new FirefoxDriver();
      
   driver.manage().window().maximize();
  try{
   String appUrl = "http://www.lenskart.com/";
   driver.get(appUrl);
   
   System.out.println("site open");
  }catch(Exception e){
   System.out.println("Site error : "+e);
  }
  
  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  try{
   driver.findElement(By.className("popup-close")).click();
   System.out.println("Popup has close");
  }catch(Exception e){
   System.out.println("Site error in popup : "+e);
  }
  Thread.sleep(500);
   try{
    Actions a1 = new Actions(driver);
       a1.moveToElement(driver.findElement(By.className("dd-login"))).build().perform();
       System.out.println("Hower mouse on login");
   }catch(Exception e){
    System.out.println("Problem in mouse hower on login : "+e);
   }
      Thread.sleep(2000);
      try{
       driver.findElement(By.xpath("//*[@id='accountdropdown']/li[1]/a")).click();
       System.out.println("My Account window has opened");
       new WebDriverWait(driver, 30) {
          }.until(new ExpectedCondition<Boolean>() {
              @Override
              public Boolean apply(WebDriver driver) {                        
                  return (driver.getWindowHandles().size() == 2);
              }
          });
      
   ArrayList<String> windows = new  ArrayList<String> (driver.getWindowHandles());
       System.out.println("Total windows opened are ::: "+windows.size());
       driver.switchTo().window(windows.get(0));
       driver.close(); 
       driver.switchTo().window(windows.get(1));
       System.out.println("Child window has closed");
        System.out.println("Control returned to parent window");
       
      }catch(Exception e){
       System.out.println("Problem to open my account page"); 
      
       
      }
      try{
    driver.findElement(By.cssSelector("a[class='button-red']")).click();
    System.out.println("'Create An Account' has close");
   }catch(Exception e){
    String e1 = null;
    System.out.println("Error in clicking 'Create An Account' : "+e1);
    
    selenium = null;
    selenium.click();
   } 
 
   //    public static void main(String args[])
       //{
        // WebElement firstname = driver.findElement(By.id("firstname"));
        // Actions builder = new Actions(driver);
        // Actions seriesOfActions = builder.moveToElement(firstname).click().sendKeys(firstname, "Rashmi");
         //seriesOfActions.perform();
         
      
              //try{
               
             //  driver.findElement(By.cssSelector("FirstName"));
             //  System.out.println("FirstName has close");
             // }catch(Exception e){
                 
    //System.out.println("Problem to enter first Name");
               
              }
    
    //WebElement element_enter = _driver.findElement(By.xpath("//*[@id='div-barcode']"));
      
      
      /*String parentHandle = driver.getWindowHandle(); ;// get the current window handle
       driver.findElement(By.xpath("//*[@id='accountdropdown']/li[1]/a")).click(); // click some link that opens a new window

       for (String winHandle : driver.getWindowHandles()) {
           driver.switchTo().window(winHandle); 
       }

       driver.close(); 
       driver.switchTo().window(parentHandle);*/ 
      //driver.quit();      
 }