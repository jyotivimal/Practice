package Practice_Java.Practice_Java;

public abstract class AbstractClass extends Geek implements interfaceExample{

	private String name;
	   private String address;
	   private int number;

	   public AbstractClass(String name, String address, int number) {
	      System.out.println("Constructing an Employee");
	      this.name = name;
	      this.address = address;
	      this.number = number;
	   }
	   
	   public abstract int abstractmethod();
	   
	   public double computePay() {
	     System.out.println("Inside Employee computePay");
	     return 0.0;
	   }
	   
	   public void mailCheck() {
	      System.out.println("Mailing a check to " + this.name + " " + this.address);
	   }

	   public String toString() {
	      return name + " " + address + " " + number;
	   }

	   public String getName() {
	      return name;
	   }
	 
	   public String getAddress() {
	      return address;
	   }
	   
	   public void setAddress(String newAddress) {
	      address = newAddress;
	   }
	 
	   public int getNumber() {
	      return number;
	   }

}

class AbstractExtendClass extends AbstractClass
{

	public AbstractExtendClass(String name, String address, int number) {
		super(name, address, number);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int abstractmethod() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void method() throws NullPointerException {
		// TODO Auto-generated method stub
		
	}

	public void method1() {
		// TODO Auto-generated method stub
		
	}
	
	/*you cannot instantiate the AbstractClass class, but you can instantiate the AbstractExtendClass Class,
	and using this instance you can access all the three fields and seven methods of Employee class as shown below.*/
}
