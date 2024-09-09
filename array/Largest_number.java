package array;
import java.util.*;

public class Largest_number {
    public static String check (int[] arr){

        String[] str= new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            str[i] = new String(arr[i]+"");
            
        }
       Arrays.sort(str, new Comparator<String>() {
        @Override
        public int compare(String a, String b) {
            String order1 = a+ b;
                String order2 = b+a;
                return order2.compareTo(order1); 

        }        
       });
       
       if(Integer.parseInt(str[0])==0)
       return "0";

       StringBuffer ans = new StringBuffer();     
       for (String s : str) {
        ans.append(s);
       }


        return ans.toString();
    }
    public static void main(String[] args) {
        int[] nums = {3, 30, 34, 5, 9};
        System.out.println(check(nums));
        
    }
    
}
