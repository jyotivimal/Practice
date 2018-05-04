package Practice_Java.Practice_Java;

public class Demo_Static{
	
	   public static void main(String args[]){
		 Student_Static s1 = new Student_Static();
	     s1.showData();
	     Student_Static s2 = new Student_Static();
	     s2.showData();
	     //Student.b++;
	     //s1.showData();
	  }
	}

	class Student_Static {
	int a; //initialized to zero
	static int b; //initialized to zero only when class is loaded not for each object created.

	Student_Static(){
	   //Constructor incrementing static variable b
	   b++;
	  }

	   public void showData(){
	      System.out.println("Value of a = "+a);
	      System.out.println("Value of b = "+b);
	   }
	//public static void increment(){
	//a++;
	//}

	}