
public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "My name is Jyoti";
		
		String array[]= name.split(" ");
		
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}

		System.out.println("*******************************************");
		
		for(int i=array.length-1;i>=0;i--)
		{
			System.out.println(array[i]);
		}
		
		
	}

}

/*Please complete following programs before next session:-

1) Reverse String (word wise)
2) Reverse String (char wise)
3) Reverse String (char wise) with spaces at same place */
