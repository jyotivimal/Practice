package Practice_Java.Practice_Java;

public class Constructor_Usage {

	public Constructor_Usage() {
		// TODO Auto-generated constructor stub
		System.out.println("I am in default constructor");
	}
	
	public Constructor_Usage(String name)
	{
		System.out.println("I am in one argument constructor");
	}
	public Constructor_Usage(String name,int age)
	{
		String con_name=name;
		int con_age=age;
		System.out.println("Student's name : "+con_name+" and age : "+con_age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor_Usage con0=new Constructor_Usage();
		Constructor_Usage con3=new Constructor_Usage("Neha");
		Constructor_Usage con1=new Constructor_Usage("Jyoti",29);
		Constructor_Usage con2=new Constructor_Usage("Vivek",34);

	}

}