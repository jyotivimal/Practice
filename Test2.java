package Practice_Java.Practice_Java;

class Test12 {   
    Test12(int x) 
    {
        System.out.println("Constructor called " + x);
    }
}
  
// This class contains an instance of Test1 
class Test2 {    
    Test12 t1 = new Test12(10);   
  
    Test2(int i) 
    { 
    	t1 = new Test12(i);
    } 
  
    public static void main(String[] args) {    
         Test2 t2 = new Test2(5);
    }
}