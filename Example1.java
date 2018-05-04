package Practice_Java.Practice_Java;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int x=1;
		
		while(x<10)
		{
			System.out.println(x);
			++x;
		}
		
		System.out.println("**********************************");
		
		for(int y=1;y<10;y++)
		{
			System.out.println(y);
		}
		
		System.out.println("**********************************");
		*/
		int z;
		
		Scanner objscan = new Scanner(System.in);
		z=objscan.nextInt();
		
		while(z!=10)
		{
			System.out.println(z);
			z=objscan.nextInt();
		}
	}

}
