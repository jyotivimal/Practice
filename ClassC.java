package Practice_Java.Practice_Java;


public class ClassC extends ClassA
{
    public void disp()
    {
        System.out.println("display method of ClassC");
    }
    public static void main(String args[])
    {
        //Assigning ClassC object to ClassC reference
        ClassC c = new ClassC();
        
        ClassA a = new ClassA();

        ClassA obja = new ClassC(); //method from object class will be called
        
        //ClassC objc = new ClassA();
        
        c.disp();
        
        a.disp();
        
        obja.disp();
        
        
       
        
    }
}