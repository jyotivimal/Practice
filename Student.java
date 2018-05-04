package Practice_Java.Practice_Java;

public class Student {

	String finame;
	String miname;
	
	/*public Student() {
	// TODO Auto-generated constructor stub
		
		
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	Student std1=new Student("Jim");
		Student std2=new Student("Mary", "Elizabeth");
	}

	public Student(String fname)
	{
		finame=fname;
		System.out.println("1. First Name is "+fname);
	}

	public Student(String fname,String mname)
	{
		this("Jim");
		finame=fname;
		miname=mname;
		System.out.println("1. First Name is "+fname);
		System.out.println("1. Middle Name is "+mname);
	}

}