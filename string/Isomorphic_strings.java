package string;

import java.util.HashMap;

//Isomorphic strings** – Determine if two strings are isomorphic (characters map uniquely).
public class Isomorphic_strings {
    public static boolean check(String s,String t){
        boolean f = false;
        if(s.length()!=t.length())
        return f;
        
        HashMap<Character, Character> m1 = new HashMap<>();
        HashMap<Character, Character> m2 = new HashMap<>();

        for (int i = 0; i <s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(m1.containsKey(c1)){
                if(m1.get(c1)!=c2)
                return f;
            }
            else
            m1.put(c1, c2);

            if(m2.containsKey(c2)){
                if(m2.get(c2)!=c1)
                return f;
            }
            else
            m1.put(c2, c1);


        }
        f= true;
        return f;
    }
    public static void main(String[] args) {
        
        
    }
}


class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }       
        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Character> reverseMap = new HashMap<>();       
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            
            if (map.containsKey(charS)) {
                if (map.get(charS) != charT) {
                    return false;
                }
            } else {
                if (reverseMap.containsKey(charT)) {
                    return false;
                }
                map.put(charS, charT);
                reverseMap.put(charT, charS);
            }
        }       
       return true;
    }
}