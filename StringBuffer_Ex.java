package Practice_Java.Practice_Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringBuffer_Ex {

	public static void main(String[] args) throws IOException {
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String: ");
		
		String s = br.readLine();
		String reverse = "";
		
		int length = s.length();
		
		for (int i=length-1;i>=0;i--)
		reverse = reverse + s.charAt(i);
		System.out.println("Result:" + reverse); */

		String s1 = new String("HELLO");
		String s2 = new String("HELLO");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		
	}

}
