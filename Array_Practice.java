package Practice_Java.Practice_Java;
import java.util.Scanner;

public class Array_Practice {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]={10,4,6,11,50};
		int smallest = array[0];
		int largest = array[4];
		Scanner objScanner = new Scanner(System.in);
		System.out.println("Enter number ");
		int number=objScanner.nextInt();
		
		int factorial = number;
		
		for(int j=1;j<number-1;j++)
		{
			factorial=factorial*j;
		}
		
		System.out.println("factorial of number "+number+" is "+factorial);
	
		for(int i=1;i<array.length;i++)
		{
			if(smallest>array[i])
			{
				smallest=array[i];
			}
			
			if(largest<array[i])
			{
				largest=array[i];
			}
		}
		
		System.out.println("Smallest number in array is "+smallest);
		System.out.println("Largest number in array is " +largest);	

	}

}
