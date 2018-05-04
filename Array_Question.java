package Practice_Java.Practice_Java;

class Array_Question {	
	public static void main(String[] args) {
		int arr[]={5,14,10,1,38,18,20};		
		for (int i=0;i<arr.length;i++)
		{
				if (arr[i]%5==0)
					{
					System.out.println("hello. its matched." + arr[i]);
					}
		}
		System.out.println("Ends here");

		sum(arr);
	}
	
	public static void sum(int arr[])
	{
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("sum of integers in array is: "+sum);
	}

}
