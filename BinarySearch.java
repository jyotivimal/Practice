package Practice_Java.Practice_Java;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		int array[]={5,10,15,20,25,30,35,40,45,50,55,60,65};
		int mid=0;
		int len=array.length;
		
		if(len%2!=0)
		{
			mid=len/2;
		}

		else
		{
			mid=(len-1)/2;
		}
		
		//System.out.println(mid);
		int count=0;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter number to be searched via binary search");
		int x= scan.nextInt();
		count++;
		for(int k=0;k<len/2;k++)
		{
		if(array[mid]==x)
		{
			System.out.println(x +" "+ mid);
			System.out.println("total iteration:  "+ count);
		}		
		else if (x>array[mid])
		{
			mid=(len+mid)/2;
			//System.out.println(mid);
		}		
		else
		{
			mid=(len-mid)/2;
			//System.out.println(mid);
		}
		
		}
	}

}
