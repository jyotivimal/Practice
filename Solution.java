package Practice_Java.Practice_Java;

public class Solution {

	public static void main(String[] args) {
		String myString="Hacker Rank";
//        char myCharArray[]= myString.toCharArray();

		boolean statusstart = myString.startsWith("Hack");
		System.out.println(statusstart);
		
		boolean statusend = myString.endsWith("Rank");
		System.out.println(statusend);
		
		String str = "Selenium-HP-QTP-UFT-Automation";
		
		String[] arr = str.split("-");
		
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
	}

}
