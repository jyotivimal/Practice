package Practice_Java.Practice_Java;

public class Example2 
 {

    public static void main(String[] args)
    {  
        int arr[]={12,23,44,56,78};  
        for(int i:arr)
        {  
            System.out.println(i);  
        }  
        
        System.out.println("**************************************");
               
        for(int count=0;count<=6;count++)
        {
        	if(count==3){
        		continue;
        	}
        	System.out.println(count);
        }
        
        System.out.println("**************************************");
        
        for(int count=0;count<=6;count++)
        {
        	if(count==3)
        	{
        		System.out.println(count);
        		continue;
        	}
        }
        
        System.out.println("**************************************");
        
        System.out.println("prime numbers");
        
        int num=100;
        int count=0;
        
        for(int i=2;i<=num;i++)
        {
        	count=0;
        	for(int j=2;j<=i/2;j++)
        	{
        		if(i%j==0)
        			{
        			count++;
        			break;
        			}
        	}
        	
        	if(count==0)
        	{
        		System.out.println(i);
        	}
        }
    }  
    
 }  
