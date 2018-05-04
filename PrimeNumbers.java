package Practice_Java.Practice_Java;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		
	/*	int i,num=0;
		String  primeNumbers = "";
		 
	       for (i = 1; i <= 100; i++)
	       {   	  
	          int counter=0;
	          for(num=i;num>=1;num--)
	          {
	        	  if(i%num==0)
	        	  {
	        		  counter = counter + 1;
	        	  }
	          }
	          
	          if(counter==2)
	          {
	        	  primeNumbers = primeNumbers + i + " " ;
	          }
	          
	       }
	       System.out.println("Prime numbers from 1 to 100 are :");
	       System.out.println(primeNumbers);*/
	       
		System.out.println("Enter number to check if its prime or not : ");
	       Scanner scan = new Scanner(System.in);
	       int j = scan.nextInt();
	       int flag=0;
	       
	       for(int i=2;i<j;i++)
	       {
	    	   if(j%i==0)
	    	   {
	    		   flag=0;
	    		   break;
	    	   }
	    	   else
	    		   flag=1;
	       }
	       
	       if(flag==1)
	       {
	    	   System.out.println(j+" is a prime number");
	       }
	       
	       else
	       {
	    	   System.out.println(j+" is not a prime number");
	       }
	}

}
