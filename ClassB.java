package Practice_Java.Practice_Java;

class A {
	//Members and methods declarations.	
	public A()
	{
		//this(); the code below is recursive. Since this() will call no arg constructor of current class again.
		System.out.println("New A");
	}

}	class B extends A {
		
		public B()
		{	
			super();	
			System.out.println("New B");
		}

		
	    //Members and methods from A are inherited.

	    //Members and methods declarations of B.

	}

public class ClassB extends ClassA 
{
    public void disp()
    {
        System.out.println("display method of ClassB");
    }
    public static void main(String args[])
	{
		A a = new A();
		B b = new B();
		A c = new B();
		
		
	}
}