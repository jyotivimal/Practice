package Practice_Java.Practice_Java;

class Animal {
	   public void move() {
	      System.out.println("Animals can move");
	   }
	}

	class Dog extends Animal {
	   public void move() {
	      System.out.println("Dogs can walk and run");
	   }
	   public void bark() {
	      System.out.println("Dogs can bark");
	   }
	}

	public class TestDog {

	   public static void main(String args[]) {
	      Animal a = new Animal();   // Animal reference and object
	      Animal b = new Dog();   // Animal reference but Dog object
	    //  Dog c = new Animal();

	      a.move();   // runs the method in Animal class
	      b.move();   // runs the method in Dog class
	   
	      //b.bark();
	      //This program will throw a compile time error since b's reference type Animal doesn't have a method by the name of bark.
	   }
	}