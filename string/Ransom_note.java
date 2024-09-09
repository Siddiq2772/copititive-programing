package string;
import java.util.*;
public class Ransom_note {
    public static boolean  canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> m1 = new HashMap<>();
        HashMap<Character, Integer> m2 = new HashMap<>();
            if(ransomNote.length()>magazine.length()||ransomNote.length()==0)
                return false;
        for (char c : ransomNote.toCharArray()) {
            m1.put(c, m1.getOrDefault(c, 0)+1);
        }
        for (char c : magazine.toCharArray()) {
            m2.put(c, m2.getOrDefault(c, 0)+1);
            
        }

        for ( char c: m1.keySet()) {
            if(!m2.containsKey(c))
            return false;
            if(m1.get(c)>m2.get(c))
            return false;
        }

        return true;
    }
    public static void main(String[] args) {
      
        
    }
    
}
