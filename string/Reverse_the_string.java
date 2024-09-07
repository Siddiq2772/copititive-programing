package string;
//Day 82: Reverse the string** – Reverse the order of words in a given string.
public class Reverse_the_string {
    public static void main(String[] args) {
        String str = "my name is siddiq";
        StringBuffer rev = new StringBuffer(str);
        System.out.println("Reverse string is: "+rev.reverse());
    }
}
