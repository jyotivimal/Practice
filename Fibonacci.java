package Practice_Java.Practice_Java;

public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int array[]=new int[10];
		array[0]=0;
		array[1]=1;
			
		for(int i=0;i<array.length;i++)
		{
			if(i>=2)
			{
				array[i]=array[i-1]+array[i-2];
			}
		System.out.println(array[i]);
		}*/
		
		int a=0,b=1,c = 0,j,count=10;
		System.out.println(a+ "\n"+b); // printing 1st 2 numbers
		// loops start from 2
		for (j=2;j<count;j++)
		{
			c=a+b;
			System.out.println(+c);
			a=b;
			b=c;
		}
	}

}
