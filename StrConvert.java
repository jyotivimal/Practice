package Practice_Java.Practice_Java;

public class StrConvert{
	
	  public static void main(String []args){
		  
		String str1="Rock";
		String str2="Star";
		
		//method 1 concatenation
		
		/*str1=str2;
		
		System.out.println(str1);
		System.out.println(str2);*/
		
		String str3 = str1.concat(str2);
		System.out.println(str3);
		
		//method 2 sum operator
		
		String str4= str1+str2;
		System.out.println(str4);
		
		System.out.println(str4.length());
		System.out.println(str4.charAt(4));
		
		System.out.println(str4.indexOf('t'));
		
	    /*String strTest = "100";
	    //This statement results in a compilation error as you
	    //cannot do arithmetic operation on Strings
	    //System.out.println("Using String:" + (strTest/4));
	    //Convert the String to Integer
	    int iTest = Integer.parseInt(strTest);
	    System.out.println("Actual String:"+ strTest);
	    System.out.println("Converted to Int:" + iTest);
	    //This will now show some arithmetic operation
	    System.out.println("Arithmetic Operation on Int:" + (iTest/4));*/
	  }
	}