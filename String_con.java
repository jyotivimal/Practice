package Practice_Java.Practice_Java;

public class String_con {

	public String_con() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		String ABC = "XYZ";
		String XYZ = "XYZ";
		
		String a = new String("XYZ");
		
		System.out.println(ABC.equals(XYZ)); //checks for content comparison
		System.out.println(ABC==XYZ);			// checks for address
		

		System.out.println(ABC.equals(a));
		System.out.println(ABC==a);
		
				
		/*String_Game objStringGame = new String_Game("my name is : Vivek Singh");
		
		objStringGame.count();
		objStringGame.reverse();
	//	objStringGame.shortname();
		
		//objStringGame.name="my name is : Vivek Singh";
		
		System.out.println("***************************************");
		objStringGame.reverse_name=" ";
		objStringGame.count();
		objStringGame.reverse();
	//	objStringGame.shortname();
*/		
	}

}
