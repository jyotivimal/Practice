import java.util.Scanner;

/**
 * 
 */

/**
 * @author Jyoti
 *
 */
public class Area {
	
	public static void odd_even()
	{
		int number;
		Scanner objScanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		number=objScanner.nextInt();
		
		if(number%2==0)
		{
			System.out.println("Number is even!!");
		}
		else
		{
			System.out.println("Number is odd!!");
		}
	}
	public static void circle_Area()
	{
		int radius=0;
		Scanner objScanner = new Scanner(System.in);
		System.out.println("Enter Radius");
		radius=objScanner.nextInt();
		double area;
		
		area=Math.PI*radius*radius;
		System.out.println(area);
	}
	public static void rectangle_Area()
	{
		int length=0;
		int breadth=0;
		Scanner objScanner = new Scanner(System.in);
		System.out.println("Enter Length of the Rectangle");
		length=objScanner.nextInt();
		
		System.out.println("Enter Breadth of the Rectangle");
		breadth=objScanner.nextInt();
		
		double area;
		
		area=length*breadth;
		System.out.println(area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		odd_even();
		circle_Area();
		rectangle_Area();
		
	}

}
