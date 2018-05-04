package Practice_Java.Practice_Java;

public class Parent {
		int value = 1000;
		byte marks= 125;
		float total = (float) 64.24;
		Parent()
		{
			System.out.println("Parent class constructor");
		}
		
		public static void main(String[] args)
		{
			Child a = new Child();
			Parent b = new Parent();
			
			Parent c = new Child();
			//Child d = new Parent();
			
			System.out.println(a.value);
			System.out.println(a.name);
			System.out.println(b.value);
		//	System.out.println(c.name); because not available in parent class..
			System.out.println(c.value);
		}
}

class Child extends Parent{
	int value = 100;
	String name = "Jyoti";
	Child()
	{
		System.out.println("child class constructor");
	}
}


/*class Test
{
	public static void main(String[] args)
	{
		Child a = new Child();
	}
}*/