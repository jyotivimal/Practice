/**
 * 
 */

/**
 * @author Jyoti
 *
 */
public class Swap_Numbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=25;
		int b=35;
		
		System.out.println("Value of A before swapping: "+a);
		System.out.println("Value of B before swapping: "+b);

		int temp=0;
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("Value of A after swapping: "+a);
		System.out.println("Value of B after swapping: "+b);
	
	int y=27;
	int z=45;
	
	System.out.println("Value of Y before swapping: "+y);
	System.out.println("Value of Z before swapping: "+z);
	
	y=y+z;
	z=y-z;
	y=y-z;

	System.out.println("Value of Y after swapping: "+y);
	System.out.println("Value of Z after swapping: "+z);
	
	}
}
