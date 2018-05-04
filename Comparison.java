package Practice_Java.Practice_Java;

public class Comparison {

	public static void main(String[] args) {
		
		String str1 = "Jyoti";
		String str2 = "Vivek";
		
		for(int i=0;i<str1.length();i++)
		{
			char ch1=str1.charAt(i);
			for(int j=0;j<str2.length();j++)
			{
				char ch2=str2.charAt(j);
				if(ch1==ch2)
				{
					System.out.println("character " +ch1 + " matches at index "+i+" of " +str1+" with character "+ch2+ " at index "+j 
							+ " of "+str2);
				}
			}
		}
	}

}
