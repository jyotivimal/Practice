import java.lang.*;

public class SystemDemo {

   public static void main(String[] args) {

   // prints Java Runtime Version before property set
   System.out.print("Previous : ");
   System.out.println(System.getProperty("java.runtime.version" ));
   System.setProperty("java.runtime.version", "Java Runtime 1.6.0");
     
   // prints Java Runtime Version after property set
   System.out.print("New : ");
   System.out.println(System.getProperty("java.runtime.version" ));
   }
} 