package Practice_Java.Practice_Java;

public class variables {
	
	static int age; //if static : initialized to zero only when class is loaded not for each object created.
	
	public void myAge()
	{
		//int age=0;
		
		age=age+20;
		System.out.println(age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		variables objvar= new variables();
		objvar.myAge();

	}

}
