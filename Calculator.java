package Practice_Java.Practice_Java;

import java.util.Scanner;

public class Calculator implements interfaceExample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator objcal = new Calculator();
		objcal.methodwhichcanthrowexc();
		
	}

	public void method() throws NullPointerException {
		// TODO Auto-generated method stub
		
		
	}

	private void methodwhichcanthrowexc() throws NullPointerException {
		// TODO Auto-generated method stub
		
		try{
			int i=9/0;
		}
		/*catch(NullPointerException e)
		{
			e.printStackTrace();
		}*/
		/*finally should have atleast a try block, catch is optional. 
		The point of finally blocks is to make sure stuff gets cleaned up whether an exception is thrown or not. */
			
			finally 
		{
			System.out.println("It might throw an exception ");
			System.out.println("I am in finally block ");	
		}
		
		
		
	}


}
