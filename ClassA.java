package Practice_Java.Practice_Java;

public class ClassA 
{
	int x=100;
	int y=20;
	
    public void disp()
    {
        System.out.println("display method of ClassA");
    }
    
    public static void main(String args[])
    {
    	ClassA objA= new ClassA();
    	System.out.println("Value of x for objA "+objA.x);
    	
    	System.out.println("Value of y for objA "+objA.y);
    	
    	ClassA objB= new ClassA();
    	System.out.println("Value of x for objA "+objB.x);
    	
    	System.out.println("Value of y for objA "+objB.y);
    }
}