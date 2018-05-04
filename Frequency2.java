package Practice_Java.Practice_Java;
import java.util.Scanner;

public class Frequency2 {

	public static void main(String[] args) {
		
		int count=0;
		int i=0;

		int array[] = {2,2,3,4,4,5,6,6,6,6,7,7,8,9};
		
		int len = array.length;
		for (i=0;i<len;i++)
		{
			count=1;
		
		for (int j=i+1;j<len;j++)
		{
			if(array[i]==array[j] && array[i]!=0)
			{
				count=count+1;
				array[j] =0;
			}
		}
		if(count>0 && array[i]!=0)
		System.out.println(array[i]+": "+count);
		}

	}

}
