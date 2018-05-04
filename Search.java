package Practice_Java.Practice_Java;

public class Search {

	public static void main(String[] args) {

		System.out.println("linear search");
		int arr[] = {5,10,12,15,8,1,20};
		int len=arr.length;
		int n=8,i;
		
		for(i=0;i<arr.length;i++)
		{
			if(n==arr[i])
			{
				break;
			}
		System.out.println("keep searching");
		}
		System.out.println("found "+n+" at "+(i+1)+"th position");
}

}
