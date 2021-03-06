package Practice_Java.Practice_Java;

class Super_class {
	   int num = 20;

	   // display method of superclass
	   public void display() {
	      System.out.println("This is the display method of superclass");
	   }

	public void my_method() {
		// TODO Auto-generated method stub
		System.out.println("method of super class");
	}
	}

	public class Sub_class extends Super_class {
	   int num = 10;

	   // display method of sub class
	   public void display() {
	      System.out.println("This is the display method of subclass");
	   }

	   public void my_method() {
	      // Instantiating subclass
	      Super_class sub = new Sub_class();
	      //Sub_class subc = new Sub_class();
	      
	      // Invoking the display() method of sub class
	      sub.display();

	      // Invoking the display() method of superclass
	      super.display();

	      // printing the value of variable num of subclass
	      System.out.println("value of the variable named num in sub class:"+ this.num);

	      // printing the value of variable num of superclass
	      System.out.println("value of the variable named num in super class:"+ super.num);
	   }

	   public static void main(String args[]) {
	      Super_class obj = new Sub_class();
	      obj.my_method();
	   }
	}