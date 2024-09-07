
package string;

/**
 * subarray //Count the number of amazing subarrays starting with vowels.
 */
public class subarray {
    public static void main(String[] args) {
        String str = "abcde";
        int num=0 ;
        String[] a= {"a","e","i","o","u"};
        for (int i = 0; i < a.length; i++) 
           if (str.contains(a[i])) 
             num++;
        System.out.println(num);        
    }    
}