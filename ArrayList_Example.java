package Practice_Java.Practice_Java;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Example {

	public static void main(String[] args) {
		
		ArrayList<String> obj = new ArrayList<String>(Arrays.asList("Aeroplane","Ball","Cat","Delhi"));
		//ArrayList<String>(Arrays.asList(Object o1,Object o2,Object o3));
		//ArrayList<T> obj = new ArrayList<T>(Collections.nCopies(count, element));
		System.out.println("Elements are: "+obj);
		
		ArrayList<String> cities = new ArrayList<String>(){{
			   add("Delhi");
			   add("Agra");
			   add("Chennai");
			   }};
		  System.out.println("Content of Array list cities:"+cities);

		ArrayList<String> obj_arrList = new ArrayList<String>();
		
		obj_arrList.add("Jyoti");
		obj_arrList.add("Vivek");
		obj_arrList.add("Neha");
		obj_arrList.add("Vicky");
		
		for(String objs: obj_arrList){
            System.out.println(objs);
        }
		
		System.out.println("ArrayList has these elements: "+obj_arrList);
		System.out.println("The size was: "+obj_arrList.size());
		
		obj_arrList.add(0,"Index 0- J");
		obj_arrList.add(1,"Index 1- V");

		System.out.println("ArrayList has these elements: "+obj_arrList);
		// rest of the early elements were pushed behind
		System.out.println("The size after adding 2 elements at mentioned indexes is: "+obj_arrList.size());
		
		obj_arrList.remove(3);
		
		
		

	}

}
