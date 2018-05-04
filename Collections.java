package Practice_Java.Practice_Java;

import java.util.ArrayList;
import java.util.Hashtable;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list=new ArrayList<String>();
		ArrayList<Integer[]> list_int = new ArrayList<Integer[]>();
		
		Integer[] a1={1,2,3,4};
		
		list.add("Jyoti");
		list.add("Vivek");
		list_int.add(0,a1);
		list_int.add(1, null);
		list_int.add(2, null);
		list_int.add(3, null);
		list.add("Vicky");
		list.add("Neha");
		
		System.out.println(list.get(2));
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		System.out.println("*************************************************************************");
		
		for(int i=0;i<list_int.size();i++)
		{
			System.out.println(list_int.get(i));
		}
		
		System.out.println("*************************************************************************");
		
		Hashtable table = new Hashtable();
		table.put("name", "Jyoti"); // in form of key value pair //key should be unique
		System.out.println(table.get("name"));
		table.put("location", "Noida");
		
		table.put("name","Vivek");
		
		System.out.println(table.get("name")); //overwritten in name
		
		
		
	}
	

}
