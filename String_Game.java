package Practice_Java.Practice_Java;

import java.text.Format.Field;

public class String_Game {
	
	public String_Game(String con_name)
	{
		this.name=con_name;
	}
	
	public static String name = "my name is : Jyoti Vimal";
	public String reverse_name=" ";
	public String s_name;
	public int count=0;
	public int max=0;
	public char val=' ';
	
	public void count()
	{
		for(int i=0;i<name.length();i++)
		{
			count=0;
			for (int j=0;j<name.length();j++)
			{
				if(name.charAt(i)==name.charAt(j))
				{
					count++;
				}
			}
			if (count>max)
			{
				max=count;
				val=name.charAt(i);
				System.out.println(val+"\n"+max+"\n"+count);
			}
		}
		System.out.println(val);
		System.out.println(max);
	}
	
	public void reverse()
	{
		char cha=' ';
		for(int j=name.length()-1;j>=0;j--)
		{
			cha=name.charAt(j);
			reverse_name+=cha;
			
		}
		
		System.out.println(reverse_name);
	}

	/*public void shortname()
	{
		int n=name.indexOf(':');
	//	System.out.println(name.substring(n,name.length()));
				
	}*/
				
	public static void main(String[] args) {
		
		String_Game objS= new String_Game(name);
		objS.count();
		//objS.reverse();
		//objS.shortname();
	}

}
