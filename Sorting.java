package Practice_Java.Practice_Java;

public class Sorting {

	public static void main(String[] args) {

		int array[]={50,60,10,20};
		int temp = 0;
		int len=array.length;
		System.out.println(len);
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length;j++)
			{
				if(array[i]<array[j])
				{
					temp = array[j];
					array[j]=array[i];
					array[i]=temp;
					
				}
				System.out.print(array[j]+" ");
			}
			System.out.println(" ");
		}

	}

}
