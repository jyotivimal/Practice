package Practice_Java.Practice_Java;

class MultiStatic
{
	static
	{
		System.out.print("A");
	}
	{
		System.out.print(" Static ");
	}
	public MultiStatic()
	{
		System.out.print("Block");
	}
	public static void main(String[]	arg)
	{
		new MultiStatic();
	}
}
