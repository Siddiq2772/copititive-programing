package string;
// First unique character in string** – Find the first character in a string that doesn’t repeat.
public class Find_the_unique_char_in_string {
    public static void main(String[] args) {
        String s1 ="my name is siddiq";
        char[] c= s1.toCharArray();
        System.out.println("char that does not repeat");
        for (int j=0 ; j<c.length;j++) {
            boolean f = true;
            for (int i=0;i<c.length;i++) 
                   if(c[j]==c[i]&&j!=i)
                    f=false;
                      
            if(f&&c[j]!=' ')
                System.out.print(c[j]+", ");
        }
    }
}
