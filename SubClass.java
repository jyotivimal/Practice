package Practice_Java.Practice_Java;

public class SubClass extends Superclass{

	SubClass(int age) {
		super(age);
		// TODO Auto-generated constructor stub
	}
	public static void main(String argd[]) {
	      SubClass s = new SubClass(24);
	      s.getAge();
	   }	

}

class Superclass {
	   int age;

	   Superclass(int age) {
	      this.age = age; 		 
	   }

	   public void getAge() {
	      System.out.println("The value of the variable named age in super class is: " +age);
	   }
	}