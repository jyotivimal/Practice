package Practice_Java.Practice_Java;
import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		
		int count=0;
		int i=0;
		char ch,c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your String");
		String str = scan.nextLine();
		
		int len = str.length();		
		for (c='A';c<='z';c++)
		{
			count=0;
		
		for (i=0;i<len;i++)
		{
			ch=str.charAt(i);
			if(ch==c)
			{
				count=count+1;
			}
		}
		if(count>0)
		System.out.println(c+" "+count);
		}

		int count1=1;
		for(int j=0;j<len;j++)
		{
			if(str.charAt(j)==' ' && str.charAt(j+1)!=' ')
			{
				count1++;
			}
		}
		
		System.out.println(count1);
	}

}
