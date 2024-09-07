package string;
//Power of 2** – Determine if a string representation of a number is a power of 2.
public class Power_of_2 {
    public static void main(String[] args) {
        String[] arr = {"1","2","3","4","5"};
        for (String str : arr) {
            if(Integer.parseInt(str) %2==0)
            System.out.print(str+", ");
        }
    }
}
