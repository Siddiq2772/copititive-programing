package string;
// **Day 81: Palindrome string** – Check if a string reads the same forwards and backwards.
public class Palindrome_string {
    public static void main(String[] args) {
    StringBuffer str = new StringBuffer("siddique");
    StringBuffer str2 = new StringBuffer(str);
    
    if (str.reverse() == str2)
        System.out.println("it is palindrome");
    else 
        System.out.println("it is not a palindrome");
    }
}
