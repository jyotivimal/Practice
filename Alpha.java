package Practice_Java.Practice_Java;

class Beta
{
	int var=7;
}
class Alpha
{
	public static void main(String[]	arg)
	{
		Beta b=new Beta();
		b.var=10;
		staticmethod(b);
		System.out.println(b.var);
	}
	public static void staticmethod(Beta b)
	{
		b=new Beta();
		b.var=20;
	}
}
