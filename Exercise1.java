
public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name= "My name is Jyoti";
		
		String[] retval = name.split(" ");
		int len=retval.length;
		
		System.out.println(len);
		System.out.println("******************************************");
		
		for(int i=0;i<len;i++)
		{
			System.out.println(retval[i]);
		}
		
		System.out.println("******************************************");
		
		for(int i=len-1;i>=0;i--)
		{
			System.out.println(retval[i]);
		}
		
	}

}
