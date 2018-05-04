package Practice_Java.Practice_Java;

public class Sample_String {
    public static void main(String args[]) {

        String str_Sample = "This is Index of Example";
        //Character at position
        System.out.println("Index of character 'x': " + str_Sample.indexOf('x'));
        //Character at position after given index value
        System.out.println("Index of character 's' after 3 index: " + str_Sample.indexOf('s', 3));
        //Give index position for the given substring
        System.out.println("Index of substring 'is': " + str_Sample.indexOf("is"));
        //Give index position for the given substring and start index
        System.out.println("Index of substring 'is' form index:" + str_Sample.indexOf("is", 5));
        
       System.out.println("********************************************************");
        
        String s1 = "This is String CharAt Method";
        //returns the char value at the 0 index
        System.out.println("Character at 0 position is: " + s1.charAt(0));
        //returns the char value at the 5th index
        System.out.println("Character at 5th position is: " + s1.charAt(5));
        //returns the char value at the 22nd index
        System.out.println("Character at 22nd position is: " + s1.charAt(22));
        //returns the char value at the 23th index
        char result = s1.charAt(23);
        System.out.println("Character at 23th position is: " + result);
    }
}