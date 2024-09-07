package string;
//Longest Common Prefix** – Find the longest prefix shared by all strings in an array.
public class Longest_Common_Prefix {
    public static void main(String[] args) {
        String[] arr={"flower", "flow", "flight"};
        //"dog", "racecar", "car"
        String pre = arr[0];
       for (int i = 1; i < arr.length; i++) {
         while(arr[i].indexOf(pre)!=0)
         {
            pre = pre.substring(0,pre.length()-1);
         }
       }
       if(pre.length()!=0)
       System.out.println("prefix is "+pre);
       else
       System.out.println("no common prefix");
       
    }
}
