package string;

/**
 * Is Subsequence** – Check if one string is a subsequence of another.
 */
public class Is_Subsequence {
public static void main(String[] args) {
    String sub = "abc";
    String str = "adbecf";
    int i=0,j=0;
    while (i<sub.length()&&j<str.length()) {
        if(sub.charAt(i)==str.charAt(j))
            i++;
        j++;
    }
    if (i==sub.length()) {
        System.out.println("it is a subsequence");
    } else {
        System.out.println("it not is a subsequence");
        
    }
    
}
    
}