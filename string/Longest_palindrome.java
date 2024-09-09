package string;

import java.util.HashMap;

//Longest Palindrome** – Determine the length of the longest palindrome that can be built using given characters.
public class Longest_palindrome {
    public static void main(String[] args) {
        String s = "abccccdd";
        HashMap<Character,Integer> hMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            hMap.put(c, hMap.getOrDefault(c, 0)+1);
        }
        int len=0;
        Boolean f = false;

        for (int v : hMap.values()) {
            if(v%2==0)
                len=len+v;
            else{
                f= true;
                len = len+(v-1);
            }
                        
        }
        if(f)
            len++;
        System.out.println(len);
    }
    
}
