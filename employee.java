
public abstract class employee {
	
	private String name;
	private String address;
	private int number;

	public employee(String name, String address, int number)
	{
		System.out.println("Constructing an Employee");
		this.name=name;
		this.address=address;
		this.number=number;
	}
	
	public double computePay()
	{
		System.out.println("Inside Employee computePay");
	     return 0.0;
	}
	
	public void mailCheck()
	{
		System.out.println("Mailing a check to "+" " +this.address);
	}
	
	public void setNumber()
	{
		
	}
	
	public void getNumber()
	{
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

}
