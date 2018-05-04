package Practice_Java.Practice_Java;

public class Pattern1
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int i,j,k,l,m,n;		
			 for(i=0;i<5;i++)
				{
					for(j=0;j<=i;j++)
					{
						System.out.print("*");
					}
					System.out.println("");
				}	
			 
			 for(i=0;i<5;i++)
				{
					for(j=5;j>i;j--)
					{
						System.out.print("*");
					}
					System.out.println("");
				}
			System.out.println(" ************************************************************************ ");
			
			int g=0;
			 for(k=10;k>0;k--)
			 {
				 for(l=k;l>0;l--)
				 {
					 System.out.print("*");
				 }
				 if(g>0)
				 {
					 for(n=0;n<g*2;n++)
					 {
						 System.out.print(" ");
					 }
				}
				 for(m=k;m>0;m--)
				 {
					 System.out.print("*");
				 }
				 System.out.println("");
				 g++;
			 }
			
	}

}
